package com.witalis.design.patterns.pattern.creational.factory.abstracts;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.AbstractFactoryInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Abstract factory pattern
 * User: Wellaxis
 * Date: 31.12.2021
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
     * Abstract Factory -> offers the interface for creating a family of related objects,
     *     without explicitly specifying their classes. An abstract factory usually has several implementations.
     *     Each of them is responsible for creating products of one of the variations.
     *
     * Algorithm:
     * ----------
     * 1. To create enumerations for different unique entity types (different entities).
     * 2. To create abstract factory class (interface) to initiate multiple different entity instances by enum types.
     * 3. To add multiple abstract methods to create different entities for derived factories.
     * 4. To create different realisations of this abstract factory for multiple entities.
     *
     * Example:
     * --------
     * 1. Enumerations -> CoffeeType [Americano, etc.], TeaType [Black, etc.]
     * 2. Abstract factory -> Cafe (abstract class)
     * 3. Abstract methods -> createCoffee(CoffeeType type), createTea(TeaType type)
     * 4. Derived factories -> Alcoholic, Classic, Exotic, Instant caffs
     */
    @Override
    public void process() {
        log.info("=================== Pattern[abstract-factory]: process ============");
        var abstractFactory = new AbstractFactoryInvoker();
        abstractFactory.invoke();
        log.info("=================================================================");
    }
}
