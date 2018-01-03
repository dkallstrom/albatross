package org.tokencreek.resource;

import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tokencreek.mapper.NavigationMapper;
import org.tokencreek.model.navigation.Navigation;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/v1")
@RequestScoped
@AlbatrossResource
public class NavigationResource {

    static final Logger logger = LoggerFactory.getLogger(NavigationResource.class);
    @Inject
    NavigationMapper navigationMapper;

    public NavigationResource(){
        //for weld injection
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("navigation/")
    public Response getAllLeftNav(){
        List<Navigation> links = navigationMapper.getAllLeftNav();
        String json = new GsonBuilder().create().toJson(links);
        logger.info("Json Links  {} ", json);
        return Response.ok(json, MediaType.APPLICATION_JSON).header("Access-Control-Allow-Origin","*").build();
    }


}
