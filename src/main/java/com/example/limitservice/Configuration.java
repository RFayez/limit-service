package com.example.limitservice;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("limit-service")
public class Configuration {

    private int maximum;
    private int minmium;


    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }

    public int getMinmium() {
        return minmium;
    }

    public void setMinmium(int minmium) {
        this.minmium = minmium;
    }

}
