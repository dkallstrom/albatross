package org.tokencreek.session;


import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.cdi.SessionFactoryProvider;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;
import java.io.IOException;
import java.io.InputStream;

import static org.apache.ibatis.io.Resources.getResourceAsStream;


@ApplicationScoped
public class SqlSessionFactoryProvider {


    @Produces
    @ApplicationScoped
    @SessionFactoryProvider
    public SqlSessionFactory produceFactory(){
        SqlSessionFactory factory = createSessionFactory();
        return  factory;
    }

    private SqlSessionFactory createSessionFactory() {
        try {
         //   SqlSessionManagerRegistry
            InputStream stream = getResourceAsStream("org/tokencreek/session/mybatis-config.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(stream);
            return  factory;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
