package serverInit;

import org.aopalliance.intercept.Invocation;
import org.springframework.web.context.ContextLoader;

public class ServerInitError {

/*
    [ERROR] [2021-05-04 16:17:25.414] (ContextLoader.java:316) initWebApplicationContext - Context initialization failed
    org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory'
    defined in class path resource [spring/spring-hibernate-common.xml]:
    Invocation of init method failed; nested exception is javax.persistence.PersistenceException: [PersistenceUnit: default]
    Unable to build Hibernate SessionFactory

    Caused by: javax.persistence.PersistenceException: [PersistenceUnit: default] Unable to build Hibernate SessionFactory

    Caused by: org.hibernate.exception.GenericJDBCException: Unable to open JDBC Connection for DDL execution

    Caused by: java.sql.SQLException: Error preloading the connection pool

    Caused by: java.sql.SQLException: Too many connections


    => MariaDB - information_schema - GLOBAL_VARIABLES
    => set global max_connections=1000;

*/


}
