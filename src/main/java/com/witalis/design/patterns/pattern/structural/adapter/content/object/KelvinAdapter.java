package com.witalis.design.patterns.pattern.structural.adapter.content.object;

/**
 * Desc: Kelvin adapter
 * User: Wellaxis
 * Date: 29.12.2021
 */
public class KelvinAdapter implements TemperatureAdapter {
    private Temperature temperature;

    public KelvinAdapter(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getValue() {
        return convertCelsius(temperature.getValue());
    }

    private static double convertCelsius(double value) {
        return value + 273.15;
    }
}
