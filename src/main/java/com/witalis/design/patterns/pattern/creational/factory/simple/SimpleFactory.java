package com.witalis.design.patterns.pattern.creational.factory.simple;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.simple.content.SimpleFactoryInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Simple factory pattern
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
@Pattern(
    name = "Simple Factory",
    type = Classification.CREATIONAL,
    isClassical = false
)
public class SimpleFactory implements IPattern {

    /**
     * Definition:
     * -----------
     * Simple Factory -> creates objects without exposing the instantiation logic
     *     to the client and refers to the newly created object through a common interface.
     *     Is a simplified version of Factory Method.
     *
     * Algorithm:
     * ----------
     * 1. To create enumeration for every unique entity type.
     * 2. To create single factory class to initiate new entity instance by enum type.
     * 3. To add public static method to factory class to create new entities.
     *
     * Example:
     * --------
     * 1. Enumeration -> DeviceType [Laptop, Tablet, Mobile, etc.]
     * 2. Simple factory -> DeviceFactory
     * 3. Static method -> public static Device create(DeviceType type);
     */
    @Override
    public void process() {
        log.info("=================== Pattern[simple-factory]: process ============");
        var simpleFactory = new SimpleFactoryInvoker();
        simpleFactory.invoke();
        log.info("=================================================================");
    }
}
