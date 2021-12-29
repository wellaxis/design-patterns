package com.witalis.design.patterns.pattern.structural.adapter.content.object;

/**
 * Desc: Health temperature
 * User: Wellaxis
 * Date: 29.12.2021
 */
public class HealthTemperature implements Temperature {

    @Override
    public double getValue() {
        return 36.6;
    }
}
