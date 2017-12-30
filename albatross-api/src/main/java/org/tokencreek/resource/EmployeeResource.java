package org.tokencreek.resource;

import com.google.gson.GsonBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tokencreek.model.employee.Employee;
import org.tokencreek.service.employee.EmployeeService;

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
public class EmployeeResource {


    @Inject
    EmployeeService employeeService;

    static final Logger logger = LoggerFactory.getLogger(EmployeeResource.class);
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("employee/{employeeId}")
    public Response getEmployee(@PathParam("employeeId")Integer employeeId){
        logger.info("Employee Id {}" , employeeId);
        Employee employee = this.employeeService.findEmployeeByEmployeeId(employeeId);

        String json = new GsonBuilder().create().toJson(employee);
        logger.info("Json Employee  {} ", json);
        return Response.ok(json, MediaType.APPLICATION_JSON).build();
    }
}
