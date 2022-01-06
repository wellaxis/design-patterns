package com.witalis.design.patterns.pattern.structural.adapter;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.adapter.content.AdapterInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Adapter pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Pattern(
    name = "Adapter",
    type = Classification.STRUCTURAL
)
public class Adapter implements IPattern {

    /**
     * Definition:
     * -----------
     * Adapter -> used to combine two incompatible objects.
     *     Converter between two incompatible objects.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for entities behaviour.
     * 2. To create multiple entity implementations based on common interface.
     * 3. To create an adapter interface to convert entities details.
     * 4. To create an adapter implementation to convert entities details
     *
     * Example:
     * --------
     * 1. Entity interface -> Temperature { double getValue(); }
     * 2. Entity classes -> [Flat, Health, Sun] { double getValue(); }
     * 3. Adapter interface -> TemperatureAdapter { double getValue(); }
     * 4. Adapter classes -> [Kelvin, Fahrenheit] { double getValue(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[adapter]: process ===================");
        var adapter = new AdapterInvoker();
        adapter.invoke();
        log.info("=================================================================");
    }
}
