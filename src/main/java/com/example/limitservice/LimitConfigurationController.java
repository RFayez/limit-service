package com.example.limitservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {

    @Autowired
    private Configuration configuration;

    @GetMapping("/limits")
    public LimitConfiguration reteriveLimitsFromConfiguration() {

        return new LimitConfiguration(configuration.getMaximum(), configuration.getMinmium());

    }
    
        @GetMapping("/limits2")
    public String reteriveLimitsFromConfiguration2() {

        return "YARAB";

    }
}
