package org.tokencreek.application;


import org.reflections.Reflections;
import org.tokencreek.resource.AlbatrossResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/albatross-api")
public class AlbatrossApplication extends Application {


    private Set<Class<?>> findAllResources(){
        Reflections reflections = new Reflections("org.tokencreek.resource");
        return reflections.getTypesAnnotatedWith(AlbatrossResource.class);

    }
    @Override
    public Set<Class<?>> getClasses(){
        Set<Class<?>> resources = new HashSet();
        resources.addAll(findAllResources());
        resources.add(AlbatrossApplication.class);
        return resources;
    }
}
