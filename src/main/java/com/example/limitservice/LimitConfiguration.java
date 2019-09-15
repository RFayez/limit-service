package com.example.limitservice;

public class LimitConfiguration {

    private int maximum;
    private int minmium;

    public LimitConfiguration(){}

    public LimitConfiguration(int maximum,int minmium){
        this.maximum=maximum;
        this.minmium=minmium;
    }

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
