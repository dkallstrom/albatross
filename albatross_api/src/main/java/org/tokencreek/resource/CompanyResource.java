package org.tokencreek.resource;

import com.google.gson.GsonBuilder;

import org.tokencreek.Company;
import org.tokencreek.qualifiers.AlbatrossService;
import org.tokencreek.service.CompanyService;
import org.tokencreek.service.CompanyServiceImpl;


import javax.annotation.Resource;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.inject.Any;
import javax.enterprise.inject.Default;
import javax.inject.Inject;
import javax.inject.Named;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;



@Path("/v1")
@RequestScoped
public class CompanyResource {


    @Inject
    private CompanyService companyService;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("company/{companyId}")
    public Response getCompany(@PathParam("companyId")Long companyId){
        Company company = companyService.getCompanyById(companyId);
        String json = new GsonBuilder().create().toJson(company);
        return javax.ws.rs.core.Response.ok(json, MediaType.APPLICATION_JSON).build();
    }
}
