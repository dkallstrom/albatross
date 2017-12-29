package org.tokencreek.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.awt.*;

@Path("/hello")
public class AlbatrossApi {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getHelloWorld(){
        return "Hello Albatross";
    }

}
