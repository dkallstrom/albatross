package org.tokencreek.migrate;

import com.mysql.cj.jdbc.MysqlDataSource;
import org.flywaydb.core.Flyway;

import javax.sql.DataSource;
import java.io.IOException;
import java.net.URL;
import java.util.Properties;

public class AlbatrossMigration {

    public static void main(String[] args) {
        new AlbatrossMigration().runMigrations();
    }

    public void runMigrations(){
        Flyway flyway = new Flyway();
        flyway.setDataSource(getDataSource());
    }

    private DataSource getDataSource() {
        Properties dataSourceProperties = new Properties();
        try {
            dataSourceProperties.load(getClass().getResourceAsStream("/org/tokencreek/migrate/data-source.properties"));
            MysqlDataSource dataSource = new MysqlDataSource();
            dataSource.setURL(String.valueOf(dataSourceProperties.get("MYSQL_DB_URL")));
            dataSource.setUser(String.valueOf(dataSourceProperties.get("MYSQL_DB_USERNAME")));
            dataSource.setPassword(String.valueOf(dataSourceProperties.get("MYSQL_DB_PASSWORD")));
            return dataSource;

        } catch (IOException e) {
            throw  new RuntimeException(e);
        }
    }
}
