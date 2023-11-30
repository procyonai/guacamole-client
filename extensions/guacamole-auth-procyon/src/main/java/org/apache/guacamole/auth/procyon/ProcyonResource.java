package org.apache.guacamole.auth.procyon;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.File;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
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

            logger.info("CZARAS resp from procyon agent: "+response.toString());
            responseMsg = response.toString();

            connection.disconnect();
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "CZARAS Error while redirecting to encoder server: " + e.getMessage());
            // Handle the exception
            return Response.serverError().type("text/plain").entity("Error while redirecting to encoder server: " + e.getMessage()).build();
        }

        return Response.ok().type("text/plain").entity("Redirecting to encoder server, msg: "+responseMsg).build();

    }

}
