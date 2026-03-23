package br.com.minisaas.config;

import javax.annotation.sql.DataSourceDefinition;
import javax.ejb.Singleton;

@Singleton
@DataSourceDefinition(
    name = "java:global/MinisaasDS", 
    className = "org.postgresql.ds.PGSimpleDataSource",
    url = "jdbc:postgresql://localhost:5433/minisaas_db", 
    user = "postgres",
    password = "admin"
)
public class DatabaseConfig {
}