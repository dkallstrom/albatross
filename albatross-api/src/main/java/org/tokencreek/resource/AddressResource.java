package org.tokencreek.resource;

import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tokencreek.model.address.Address;
import org.tokencreek.service.address.AddressService;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/v1")
@RequestScoped
@AlbatrossResource
public class AddressResource {

    static final Logger logger = LoggerFactory.getLogger(AddressResource.class);
    @Inject
    AddressService addressService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("address/{addressId}")
    public Response getAddress(@PathParam("addressId")Integer addressId){
        logger.info("Address Id {}" , addressId);
        Address address = this.addressService.findAddressByAddressId(addressId);
        String json = new GsonBuilder().create().toJson(address);
        logger.info("Json Address  {} ", json);
        return javax.ws.rs.core.Response.ok(json, MediaType.APPLICATION_JSON).header("Access-Control-Allow-Origin","*").build();
    }
}
