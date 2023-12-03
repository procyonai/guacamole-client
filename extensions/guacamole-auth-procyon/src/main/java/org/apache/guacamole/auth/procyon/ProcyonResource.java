package org.apache.guacamole.auth.procyon;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.*;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.logging.Logger;
import java.util.logging.Level;

public class ProcyonResource {

    private static final Logger logger = Logger.getLogger(ProcyonAuthenticationProvider.class.getName());

    @GET
    @Path("/{historyUUID}")
    public Response redirectToIdentityProvider(@PathParam("historyUUID") String historyUUID) {

        File recordingFile = new File("/var/lib/guacamole/recordings", historyUUID);
        if (!recordingFile.exists()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        String responseMsg = "";
        try {
            URL url = new URL("http://guacamole-server:8123/encode");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setDoOutput(true);

            try(DataOutputStream wr = new DataOutputStream(connection.getOutputStream())) {
                String urlEncodedInputString = "path=/var/lib/guacamole/recordings/" + historyUUID;
                wr.writeBytes(urlEncodedInputString);
            }

            StringBuilder response = new StringBuilder();
            try(BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()))) {
                String responseLine;
                while ((responseLine = br.readLine()) != null) {
                    response.append(responseLine.trim());
                }
            }
            int code = connection.getResponseCode();

            logger.info("CZARAS resp from procyon agent: "+ code +", body: '"+response +"'");
            responseMsg = response.toString();

            connection.disconnect();
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "CZARAS Error while redirecting to encoder server: " + e.getMessage());
            // Handle the exception
            return Response.serverError().type("text/plain").entity("Error while redirecting to encoder server: " + e.getMessage()).build();
        }

        File encodedFile = new File("/var/lib/guacamole/recordings", historyUUID+ ".m4v");
        if (!encodedFile.exists()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        FileInputStream fl;
        try {
            fl = new FileInputStream(encodedFile);
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "CZARAS Error while reading encoded file: " + e.getMessage());
            // Handle the exception
            return Response.serverError().type("text/plain").entity("Error while reading encoded file: " + e.getMessage()).build();
        }

        // Now creating byte array of same length as file
        byte[] arr = new byte[(int)encodedFile.length()];

        // Reading file content to byte array
        // using standard read() method
        try {
            int ret = fl.read(arr);
            if (ret != -1) {
                logger.log(Level.SEVERE, "CZARAS Error while reading encoded file: " + ret);
                // Handle the exception
                return Response.serverError().type("text/plain").entity("Error while reading encoded file: " + ret).build();
            }
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "CZARAS Error while reading encoded file: " + e.getMessage());
            // Handle the exception
            return Response.serverError().type("text/plain").entity("Error while reading encoded file: " + e.getMessage()).build();
        }

        // lastly closing an instance of file input stream
        // to avoid memory leakage
        try {
            fl.close();
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "CZARAS Error while closing encoded file: " + e.getMessage());
            // Handle the exception
            return Response.serverError().type("text/plain").entity("Error while closing encoded file: " + e.getMessage()).build();
        }

        return Response.ok().build();

    }

}
