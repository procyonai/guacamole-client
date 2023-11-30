package org.apache.guacamole.auth.procyon;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import java.io.File;

public class ProcyonResource {

    @GET
    @Path("/{historyUUID}")
    public Response redirectToIdentityProvider(@PathParam("historyUUID") String historyUUID) {

        File recordingFile = new File("/var/lib/guacamole/recordings", historyUUID);
        if (!recordingFile.exists()) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        return Response.ok().build();

    }

}
