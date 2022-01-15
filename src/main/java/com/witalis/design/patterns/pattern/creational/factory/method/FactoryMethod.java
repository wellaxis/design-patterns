package com.witalis.design.patterns.pattern.creational.factory.method;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.method.content.FactoryMethodInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Factory method pattern
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
@Pattern(
    name = "Factory Method",
    type = Classification.CREATIONAL,
    isClassical = true
)
public class FactoryMethod implements IPattern {

    /**
     * Definition:
     * -----------
     * Factory Method -> defines an interface for creating objects,
     *     but let subclasses decide which class to instantiate and
     *     refers to the newly created object through a common interface.
     *
     * Algorithm:
     * ----------
     * 1. To create enumeration for every unique entity type.
     * 2. To create single abstract factory class (interface) to initiate new entity instance by enum type.
     * 3. To add abstract method to abstract factory to create new entities for derived factories.
     * 4. To create multiple derived factories to initiate different entities (override method).
     *
     * Example:
     * --------
     * 1. Enumeration -> CoffeeType [Americano, Cappuccino, Espresso, Latte]
     * 2. Abstract factory -> CoffeeShop (abstract class)
     * 3. Abstract method -> createCoffee(CoffeeType type)
     * 4. Derived factories -> Alcoholic, Classic, Exotic, Instant coffee shops
     */
    @Override
    public void process() {
        log.info("=================== Pattern[factory-method]: process ============");
        var factoryMethod = new FactoryMethodInvoker();
        factoryMethod.invoke();
        log.info("=================================================================");
    }
}
