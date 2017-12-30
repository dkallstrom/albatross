package org.tokencreek.resource;

import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tokencreek.model.company.Company;
import org.tokencreek.service.company.CompanyService;

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
public class CompanyResource {


    @Inject
    CompanyService companyService;

    static final Logger logger = LoggerFactory.getLogger(CompanyResource.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("company/{companyId}")
    public Response getCompany(@PathParam("companyId")Integer companyId){
        logger.info("Company Id {}" , companyId);
        Company company = this.companyService.getCompanyById(companyId);
        String json = new GsonBuilder().create().toJson(company);
        logger.info("Json Company  {} ", json);
        return javax.ws.rs.core.Response.ok(json, MediaType.APPLICATION_JSON).build();
    }
}
