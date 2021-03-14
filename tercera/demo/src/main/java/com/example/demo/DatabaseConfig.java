package com.example.demo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
 
@Configuration
public class DatabaseConfig {
    @Bean(name = "dsSlave")
    @ConfigurationProperties(prefix = "legacy.datasource")
    public DataSource slaveDataSource() {
        return DataSourceBuilder.create().build();
    }
 
 
    @Bean(name = "jdbcSlave")
    @Autowired
    public JdbcTemplate slaveJdbcTemplate(@Qualifier("dsSlave") DataSource dsSlave) {
        return new JdbcTemplate(dsSlave);
    }
 
}