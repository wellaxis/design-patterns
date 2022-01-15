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
    type = Classification.STRUCTURAL,
    isClassical = true
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
     * 1. Entity interface -> Device { double getSpeed(); }
     * 2. Entity classes -> [Laptop, Tablet, Mobile] { double getSpeed(); }
     * 3. Adapter interface -> FrequencyAdapter { double getValue(); }
     * 4. Adapter classes -> [Mega, Kilo, Hertz] { double getValue(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[adapter]: process ===================");
        var adapter = new AdapterInvoker();
        adapter.invoke();
        log.info("=================================================================");
    }
}
