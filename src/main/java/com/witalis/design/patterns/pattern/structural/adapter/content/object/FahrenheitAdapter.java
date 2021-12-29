package com.witalis.design.patterns.pattern.structural.adapter.content.object;

/**
 * Desc: Fahrenheit adapter
 * User: Wellaxis
 * Date: 29.12.2021
 */
public class FahrenheitAdapter implements TemperatureAdapter {
    private Temperature temperature;

    public FahrenheitAdapter(Temperature temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getValue() {
        return convertCelsius(temperature.getValue());
    }

    private static double convertCelsius(double value) {
        return value * 9 / 5 + 32;
    }
}
