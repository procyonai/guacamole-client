package org.apache.guacamole;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.*;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class ProcyonUploader {
    /**
     * Logger for this class.
     */
    private final Logger logger = LoggerFactory.getLogger(ProcyonUploader.class);

    private final Object mutex = new Object();
    private final Map<String, AbstractMap.SimpleEntry<String, String>> filesToUpload = new HashMap<>();

    Thread uploadThread;


    private static final String RECORDING_PATH = "/var/lib/guacamole/recordings";
    private static final String UPLOAD_CONFIG_PATH = "/var/lib/procyon/upload-config.json";

    public void addRecording(String connectionName, String username, long startDate, long endDate) {
        String dirName = RECORDING_PATH + "/" + connectionName+ "/" + username + ".m4v";
        AbstractMap.SimpleEntry<String, String> dates = new AbstractMap.SimpleEntry<>(
                Long.toString(startDate),
                Long.toString(endDate));
        synchronized (mutex) {
            try {
                filesToUpload.put(dirName, dates);
            } catch (NullPointerException | IllegalArgumentException | UnsupportedOperationException | ClassCastException e) {
                logger.error("Error adding recording to upload list: {}", dirName, e);
            }
            if (uploadThread == null) {
                logger.info("starting the upload thread");
                uploadThread = new Thread(() -> {
                    while (true){
                        try {
                            uploadRecordings();
                        } catch (Exception e) {
                            logger.error("Error uploading recordings", e);
                        }
                        logger.info("Waiting for 30 seconds before uploading recordings...");
                        final long ninetySeconds = 30 * 1000;
                        try {
                            Thread.sleep(ninetySeconds);
                        } catch (InterruptedException e) {
                            logger.error("Error in thread sleep", e);
                        }
                    }
                });
                try {
                    uploadThread.start();
                    logger.info("Started the upload thread");
                } catch (IllegalThreadStateException e) {
                    logger.error("Failed to start the upload thread", e);
                }
            }
        }
    }

    private void uploadRecordings() {
        logger.info("Uploading recordings...");

        // get upload configuration
        ObjectMapper objectMapper = new ObjectMapper();
        ProcyonUploadConfig uploadConfig;
        try {
            // Read JSON file and convert to Config object
            uploadConfig = objectMapper.readValue(
                    new File(UPLOAD_CONFIG_PATH),
                    ProcyonUploadConfig.class);
        } catch (IOException e) {
            logger.error("Failed to parse the upload config file: {}", UPLOAD_CONFIG_PATH, e);
            return;
        }
        logger.info("Upload config: {}", uploadConfig.toString());

        try {
            uploadConfig.validate();
        } catch (IllegalArgumentException e) {
            logger.error("Invalid upload config: {}", e.getMessage());
            return;
        }

        if (!uploadConfig.getCloud().equals(ProcyonUploadConfig.ProcyonAWSUploadConfig.CLOUD_TYPE_AWS)) {
            logger.error("Unsupported cloud type: {}", uploadConfig.getCloud());
            return;
        }

        AmazonS3 s3Client = uploadConfig.getS3Client();

        Map<String, AbstractMap.SimpleEntry<String, String>> uploadList;
        synchronized (mutex) {
            uploadList = new HashMap<>(filesToUpload);
        }

        for (String filePath : uploadList.keySet()) {
            if (filePath == null) {
                logger.error("Null file path");
                continue;
            }
            logger.info("Uploading file: {}...", filePath);

            File file;
            try {
                file = getRecordingFile(filePath);
            } catch (IOException e) {
                logger.error("Error getting recording file: {}", filePath, e);
                continue;
            }

            String[] pathParts = filePath.split("/");
            if (pathParts.length < 2) {
                logger.error("Invalid file path: {}", filePath);
                continue;
            }
            String key = pathParts[pathParts.length - 2] + "/" + pathParts[pathParts.length - 1];

            AbstractMap.SimpleEntry<String, String> dates = uploadList.get(filePath);
            String startDate = dates.getKey();
            String endDate = dates.getValue();

            // upload file
            // Create metadata for the file
            ObjectMetadata metadata = new ObjectMetadata();
            metadata.addUserMetadata("startdate-ms", startDate);
            metadata.addUserMetadata("enddate-ms", endDate);
            metadata.addUserMetadata("tenant", uploadConfig.getTenant());

            Tag tenantTag = new Tag("tenant", uploadConfig.getTenant());

            // Create the request to upload the file with metadata
            String bucketName = uploadConfig.getAws().getS3Bucket();
            PutObjectRequest request = new PutObjectRequest(bucketName, key, file)
                    .withMetadata(metadata)
                    .withTagging(new ObjectTagging(Collections.singletonList(tenantTag)));
            try {
                s3Client.putObject(request);
            } catch (AmazonS3Exception e) {
                logger.error("AmazonS3Exception while uploading file: {}", filePath, e);
                continue;
            }
            logger.info("File uploaded successfully: {}", filePath);

            synchronized (mutex) {
                try {
                    filesToUpload.remove(filePath);
                } catch (Exception e) {
                    logger.error("Error removing file from upload list: {}", filePath, e);
                }
            }
        }
    }

    private File getRecordingFile(String filePath) throws IOException {
        final float backoffFactor = 1.5f;
        final long maxSleepTimeMs = 10 * 1000;
        long sleepTimeMs = 1000;
        for (int i = 0; i < 10; i++) {
            if (i > 0) {
                try {
                    Thread.sleep(sleepTimeMs);
                    float newSleepTimeMs = sleepTimeMs * backoffFactor;
                    sleepTimeMs = (long) Math.min(newSleepTimeMs, maxSleepTimeMs);
                } catch (InterruptedException e) {
                    logger.error("Error in thread sleep", e);
                }
            }
            File f = new File(filePath);
            if (!f.exists()) {
                logger.warn("File does not exist: {}", filePath);
                continue;
            }

            File lockFile = new File(filePath + ".lock");
            if (lockFile.exists()) {
                logger.warn("Encoding of {} in progress...", filePath);
                continue;
            }
            return f;
        }
        throw new IOException("File not ready: " + filePath);
    }
}
