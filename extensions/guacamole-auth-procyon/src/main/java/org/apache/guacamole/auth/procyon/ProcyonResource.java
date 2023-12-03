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
    public Response convertRecording(@PathParam("historyUUID") String historyUUID) {

        File recordingFile = new File("/var/lib/guacamole/recordings", historyUUID);
        if (!recordingFile.exists()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        try {
            URL url = new URL("http://guacamole-server:8123/encode");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();

            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int code = connection.getResponseCode();

            logger.info("CZARAS resp from procyon agent: "+ code);
            String responseMsg = "/" + historyUUID + ".m4v";

            connection.disconnect();
            return Response.ok().type("text/plain").entity(responseMsg).build();
        }
        catch (Exception e) {
            logger.log(Level.SEVERE, "CZARAS Error while redirecting to encoder server: " + e.getMessage());
            // Handle the exception
            return Response.serverError().type("text/plain").entity("Error while redirecting to encoder server: " + e.getMessage()).build();
        }
    }

}
