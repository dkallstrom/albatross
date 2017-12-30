package org.tokencreek.application;


import org.tokencreek.api.AlbatrossApi;
import org.tokencreek.resource.CompanyResource;
import org.tokencreek.resource.EmployeeResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/albatross-api")
public class AlbatrossApplication extends Application {


    @Override
    public Set<Class<?>> getClasses(){

        HashSet h = new HashSet<Class<?>> ();
        h.add(AlbatrossApi.class);
        h.add(CompanyResource.class);
        h.add(EmployeeResource.class);
        return  h;
    }
}
