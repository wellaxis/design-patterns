package com.witalis.design.patterns.pattern.structural.bridge;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.bridge.content.BridgeInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Bridge pattern
 * User: Wellaxis
 * Date: 09.12.2021
 */
@Slf4j
@Pattern(
    name = "Bridge",
    type = Classification.STRUCTURAL
)
public class Bridge implements IPattern {

    /**
     * Definition:
     * -----------
     * Bridge -> decouples an abstraction from its implementation
     *     allowing the two to vary independently. Makes concrete classes
     *     independent of interface implementation classes.
     *
     *     Goal: flexibility. It is possible to change
     *     interfaces and implementations independently.
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
        log.info("=================== Pattern[bridge]: process ====================");
        var bridge = new BridgeInvoker();
        bridge.invoke();
        log.info("=================================================================");
    }
}
