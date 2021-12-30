package com.witalis.design.patterns.pattern.creational.factory.abstracts;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.AbstractFactoryInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Abstract factory pattern
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
@Pattern(
    name = "Abstract Factory",
    type = Classification.CREATIONAL
)
public class AbstractFactory implements IPattern {

    /**
     * Definition:
     * -----------
     * Abstract Factory -> Offers the interface for creating a family of related objects,
     *     without explicitly specifying their classes.
     *
     * Algorithm:
     * ----------
     * 1. To create enumeration for every unique entity type.
     * 2. To create factory class to initiate new entity instance by enum type.
     */
    @Override
    public void process() {
        log.info("=================== Pattern[abstract-factory]: process ============");
        var abstractFactory = new AbstractFactoryInvoker();
        abstractFactory.invoke();
        log.info("=================================================================");
    }
}
