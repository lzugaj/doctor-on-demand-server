package com.luv2code.doctorondemand;

import com.luv2code.doctorondemand.config.profile.Config;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DoctorOnDemandApplication {

    private final Config config;

    @Autowired
    public DoctorOnDemandApplication(Config config) {
        this.config = config;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder()
                .sources(DoctorOnDemandApplication.class)
                .profiles("dev")
                .run(args);
    }

    @Bean
    public CommandLineRunner execute() {
        return args -> config.setup();
    }
}
