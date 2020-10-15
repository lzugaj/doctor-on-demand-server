package com.luv2code.doctorondemand.config.profile;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Profile("prod")
@Component
public class ProdConfig implements Config {

    @Override
    public void setup() {
        System.out.println("Production profile active");
    }
}