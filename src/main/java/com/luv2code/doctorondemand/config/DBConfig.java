package com.luv2code.doctorondemand.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(DBConfig.class);

    private String driverClassName;

    private String url;

    private String username;

    private String password;

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Bean
    @Profile("dev")
    public String devDatabaseConnection() {
        LOGGER.info("\n-----------------------------------------");
        LOGGER.info("DB connection for DEV - H2");
        LOGGER.info("Driver class name: " + driverClassName);
        LOGGER.info("URL: " + url);
        LOGGER.info("Username: " + username);
        LOGGER.info("Password: " + password);
        LOGGER.info("-----------------------------------------\n");
        return "DB connection for DEV - H2";
    }

    @Bean
    @Profile("prod")
    public String prodDatabaseConnection() {
        LOGGER.info("\n-----------------------------------------");
        LOGGER.info("DB connection for DEV - Postgres");
        LOGGER.info("Driver class name: " + driverClassName);
        LOGGER.info("URL: " + url);
        LOGGER.info("Username: " + username);
        LOGGER.info("Password: " + password);
        LOGGER.info("-----------------------------------------\n");
        return "DB connection for PROD - Postgres";
    }
}
