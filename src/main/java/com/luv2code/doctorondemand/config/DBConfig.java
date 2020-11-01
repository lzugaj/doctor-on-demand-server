package com.luv2code.doctorondemand.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ConfigurationProperties("spring.datasource")
public class DBConfig {

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
        System.out.println("\n-----------------------------------------");
        System.out.println("DB connection for DEV - H2");
        System.out.println("Driver class name: " + driverClassName);
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("-----------------------------------------\n");
        return "DB connection for DEV - H2";
    }

    @Bean
    @Profile("prod")
    public String prodDatabaseConnection() {
        System.out.println("\n-----------------------------------------");
        System.out.println("DB connection for DEV - Postgres");
        System.out.println("Driver class name: " + driverClassName);
        System.out.println("URL: " + url);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        System.out.println("-----------------------------------------\n");
        return "DB connection for PROD - Postgres";
    }
}
