package com.luv2code.doctorondemand.config.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("dev")
@Component
public class DevConfig implements Config {

    @Override
    public void setup() {
        System.out.println("Development profile active");
    }
}