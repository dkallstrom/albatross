package org.tokencreek.application;


import com.google.common.collect.Sets;
import org.reflections.Reflections;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.tokencreek.resource.AlbatrossResource;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.Set;

@ApplicationPath("/albatross-api")
public class AlbatrossApplication extends Application {


    static final Logger logger = LoggerFactory.getLogger(AlbatrossApplication.class);
    private static final Set<Class<?>> allResources = Sets.newHashSet();
    private Set<Class<?>> findAllResources(){
        if(allResources.isEmpty()){
            Reflections reflections = new Reflections("org.tokencreek.resource");
            allResources.addAll(reflections.getTypesAnnotatedWith(AlbatrossResource.class));
            logger.info("Loading Resources {}" , allResources.size());
        }

        return allResources;

    }
    @Override
    public Set<Class<?>> getClasses(){
        return findAllResources();
    }
}
