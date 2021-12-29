package com.witalis.design.patterns.pattern.structural.adapter.content;

import com.witalis.design.patterns.pattern.structural.adapter.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker adapter class
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class AdapterInvoker {

    public void invoke() {
        log.info("\tAdapter: begin");
        long begin = System.nanoTime();
        try {
            Temperature temperature;
            TemperatureAdapter fahrenheit;
            TemperatureAdapter kelvin;

            // health
            temperature = new HealthTemperature();
            fahrenheit = new FahrenheitAdapter(temperature);
            kelvin = new KelvinAdapter(temperature);
            log.info("\tTemperature[health]:");
            log.info("\t- Celsius: {}", temperature.getValue());
            log.info("\t- Fahrenheit: {}", fahrenheit.getValue());
            log.info("\t- Kelvin: {}", kelvin.getValue());

            log.info("");

            // health
            temperature = new FlatTemperature();
            fahrenheit = new FahrenheitAdapter(temperature);
            kelvin = new KelvinAdapter(temperature);
            log.info("\tTemperature[health]:");
            log.info("\t- Celsius: {}", temperature.getValue());
            log.info("\t- Fahrenheit: {}", fahrenheit.getValue());
            log.info("\t- Kelvin: {}", kelvin.getValue());

            log.info("");

            // health
            temperature = new SunTemperature();
            fahrenheit = new FahrenheitAdapter(temperature);
            kelvin = new KelvinAdapter(temperature);
            log.info("\tTemperature[health]:");
            log.info("\t- Celsius: {}", temperature.getValue());
            log.info("\t- Fahrenheit: {}", fahrenheit.getValue());
            log.info("\t- Kelvin: {}", kelvin.getValue());

            log.info("");

        } catch (Exception e) {
            log.error("\tAdapter: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tAdapter: end, time = {} ms", (end - begin) / 1000);
    }
}
