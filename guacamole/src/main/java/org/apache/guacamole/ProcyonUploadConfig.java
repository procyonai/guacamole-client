package org.apache.guacamole;

import com.amazonaws.auth.AWSCredentialsProvider;
import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicSessionCredentials;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.securitytoken.AWSSecurityTokenService;
import com.amazonaws.services.securitytoken.AWSSecurityTokenServiceClientBuilder;
import com.amazonaws.services.securitytoken.model.AssumeRoleRequest;
import com.amazonaws.services.securitytoken.model.AssumeRoleResult;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcyonUploadConfig {
    public class ProcyonAWSUploadConfig {
        public final static String CLOUD_TYPE_AWS = "aws";
        public final static String AWS_CREDS_TYPE_STATIC = "static";
        public final static String AWS_CREDS_TYPE_ROLE = "role";
        public final static String AWS_CREDS_TYPE_ENV = "env";

        // AWSStaticCredentials is the config for the AWS upload procedure
        public class AWSStaticCredentials {
            @JsonProperty(defaultValue = "")
            private String accessKey = "";

            @JsonProperty(defaultValue = "")
            private String secretKey = "";

            @JsonProperty(defaultValue = "")
            private String sessionToken = "";

            public String getAccessKey() {
                return accessKey;
            }

            public void setAccessKey(String accessKey) {
                this.accessKey = accessKey;
            }

            public String getSecretKey() {
                return secretKey;
            }

            public void setSecretKey(String secretKey) {
                this.secretKey = secretKey;
            }

            public String getSessionToken() {
                return sessionToken;
            }

            public void setSessionToken(String sessionToken) {
                this.sessionToken = sessionToken;
            }

            @Override
            public String toString() {
                return "AWSStaticCredentials{" +
                        "accessKey='" + accessKey + '\'' +
                        ", secretKey='" + secretKey + '\'' +
                        ", sessionToken='" + sessionToken + '\'' +
                        '}';
            }
        }

        // AWSRoleCredentials is the config for the AWS upload procedure
        public class AWSRoleCredentials {
            @JsonProperty(defaultValue = "")
            private String roleARN = "";

            @JsonProperty(defaultValue = "")
            private String externalID = "";

            public String getRoleARN() {
                return roleARN;
            }

            public void setRoleARN(String roleARN) {
                this.roleARN = roleARN;
            }

            public String getExternalID() {
                return externalID;
            }

            public void setExternalID(String externalID) {
                this.externalID = externalID;
            }

            @Override
            public String toString() {
                return "AWSRoleCredentials{" +
                        "roleARN='" + roleARN + '\'' +
                        ", externalID='" + externalID + '\'' +
                        '}';
            }
        }

        private AWSStaticCredentials staticCredentials = new AWSStaticCredentials();
        private AWSRoleCredentials roleCredentials = new AWSRoleCredentials();

        @JsonProperty(defaultValue = "")
        private String s3Bucket = "";

        @JsonProperty(defaultValue = "")
        private String region = "";

        @JsonProperty(defaultValue = "")
        private String type = "";

        public String getS3Bucket() {
            return s3Bucket;
        }

        public void setS3Bucket(String s3Bucket) {
            this.s3Bucket = s3Bucket;
        }

        public String getRegion() {
            return region;
        }

        public void setRegion(String region) {
            this.region = region;
        }

        public String getType() { return type; }

        public void setType(String type) { this.type = type; }

        public AWSStaticCredentials getStaticCredentials() { return staticCredentials; }

        public void setStaticCredentials(AWSStaticCredentials staticCredentials) { this.staticCredentials = staticCredentials; }

        public AWSRoleCredentials getRoleCredentials() {
            return roleCredentials;
        }

        public void setRoleCredentials(AWSRoleCredentials roleCredentials) {
            this.roleCredentials = roleCredentials;
        }

        @Override
        public String toString() {
            return "ProcyonAWSUploadConfig{" +
                    "  s3Bucket='" + s3Bucket + '\'' +
                    ", region='" + region + '\'' +
                    ", type='" + type + '\'' +
                    ", roleCredentials='" + roleCredentials.toString() + '\'' +
                    ", staticCredentials='" + staticCredentials.toString() + '\'' +
                    '}';
        }
    }

    @JsonProperty(defaultValue = "")
    private String cloud = "";

    @JsonProperty(defaultValue = "")
    private String tenant = "";

    @JsonProperty(defaultValue = "")
    private String lastUpdated = "";

    /**
     * Logger for this class.
     */
    private final Logger logger = LoggerFactory.getLogger(ProcyonUploadConfig.class);

    private ProcyonAWSUploadConfig aws = new ProcyonAWSUploadConfig();

    // Getters and setters
    public String getCloud() { return cloud; }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getTenant() { return tenant; }

    public void setTenant(String cloud) {
        this.tenant = cloud;
    }

    public String getLastUpdated() { return lastUpdated; }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ProcyonAWSUploadConfig getAws() {
        return aws;
    }

    public void setAws(ProcyonAWSUploadConfig aws) {
        this.aws = aws;
    }

    public AmazonS3 getS3Client() throws IllegalArgumentException {
        if (!cloud.equals(ProcyonAWSUploadConfig.CLOUD_TYPE_AWS)) {
            throw new IllegalArgumentException("Not an AWS cloud type: " + cloud);
        }

        if (aws.getType().equals(ProcyonAWSUploadConfig.AWS_CREDS_TYPE_ENV)) {
            return AmazonS3ClientBuilder.defaultClient();
        }

        AWSCredentialsProvider credentialsProvider;
        if (aws.getType().equals(ProcyonAWSUploadConfig.AWS_CREDS_TYPE_ROLE)) {
            credentialsProvider = getRoleCredentials();
        } else if (aws.getType().equals(ProcyonAWSUploadConfig.AWS_CREDS_TYPE_STATIC)) {
            credentialsProvider = getStaticCredentials();
        } else {
            throw new IllegalArgumentException("Invalid AWS credentials type: " + aws.getType());
        }

        return AmazonS3ClientBuilder.standard()
                .withCredentials(credentialsProvider)
                .withRegion(aws.getRegion())
                .build();
    }

    public void validate() throws IllegalArgumentException {
        if (cloud.equals(ProcyonAWSUploadConfig.CLOUD_TYPE_AWS)) {
            if (aws.getS3Bucket().isEmpty()) {
                throw new IllegalArgumentException("S3 bucket is required for AWS cloud type");
            }

            if (aws.getRegion().isEmpty()) {
                throw new IllegalArgumentException("Region is required for AWS cloud type");
            }

            if (aws.getType().isEmpty()) {
                throw new IllegalArgumentException("Type is required for AWS cloud type");
            }

            if (aws.getType().equals(ProcyonAWSUploadConfig.AWS_CREDS_TYPE_ROLE)) {
                if (aws.getRoleCredentials().getRoleARN().isEmpty()) {
                    throw new IllegalArgumentException("Role ARN is required for AWS role credentials");
                }
            } else if (aws.getType().equals(ProcyonAWSUploadConfig.AWS_CREDS_TYPE_STATIC)) {
                if (aws.getStaticCredentials().getAccessKey().isEmpty()) {
                    throw new IllegalArgumentException("Access key is required for AWS static credentials");
                }

                if (aws.getStaticCredentials().getSecretKey().isEmpty()) {
                    throw new IllegalArgumentException("Secret key is required for AWS static credentials");
                }

                if (aws.getStaticCredentials().getSessionToken().isEmpty()) {
                    throw new IllegalArgumentException("Session token is required for AWS static credentials");
                }
            } else {
                throw new IllegalArgumentException("Invalid AWS credentials type: " + aws.getType());
            }
        } else {
            throw new IllegalArgumentException("Invalid cloud type: " + cloud);
        }
    }

    private AWSCredentialsProvider getRoleCredentials() {
        String roleARN = aws.getRoleCredentials().getRoleARN();
        String externalID = aws.getRoleCredentials().getExternalID();

        AssumeRoleRequest assumeRoleRequest = new AssumeRoleRequest()
                .withRoleArn(roleARN)
                .withRoleSessionName("procyon-upload-" + System.currentTimeMillis());

        if (!externalID.isEmpty()) {
            assumeRoleRequest.setExternalId(externalID);
        }

//        AWSSecurityTokenService stsClient = AWSSecurityTokenServiceClientBuilder.standard().withRegion(region).build();
        AWSSecurityTokenService stsClient = AWSSecurityTokenServiceClientBuilder.standard().build();
        AssumeRoleResult assumeRoleResult = stsClient.assumeRole(assumeRoleRequest);

        return new AWSStaticCredentialsProvider(new BasicSessionCredentials(
                assumeRoleResult.getCredentials().getAccessKeyId(),
                assumeRoleResult.getCredentials().getSecretAccessKey(),
                assumeRoleResult.getCredentials().getSessionToken()
        ));
    }

    private AWSCredentialsProvider getStaticCredentials() {
        String accessKey = aws.getStaticCredentials().getAccessKey();
        String secretKey = aws.getStaticCredentials().getSecretKey();
        String sessionToken = aws.getStaticCredentials().getSessionToken();
        return new AWSStaticCredentialsProvider(new BasicSessionCredentials(accessKey, secretKey, sessionToken));
    }

    @Override
    public String toString() {
        return "ProcyonUploadConfig{" +
                "cloud='" + cloud + '\'' +
                ", tenant='" + tenant + '\'' +
                ", aws=" + aws.toString() +
                '}';
    }
}
