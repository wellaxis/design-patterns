package com.witalis.design.patterns.pattern.structural.adapter.content.object;

/**
 * Desc: Sun temperature
 * User: Wellaxis
 * Date: 29.12.2021
 */
public class SunTemperature implements Temperature {

    @Override
    public double getValue() {
        return 5500.0;
    }
}
