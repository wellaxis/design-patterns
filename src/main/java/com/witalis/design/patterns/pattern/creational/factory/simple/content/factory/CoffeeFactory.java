package com.witalis.design.patterns.pattern.creational.factory.simple.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.coffee.*;

/**
 * Desc: Coffee factory class
 * User: Wellaxis
 * Date: 28.12.2021
 */
public class CoffeeFactory {

    /**
     * Static method to create a required entity instance based on its type.
     * <p/>
     * @param type the type of required entity
     * @return the instance of required entity
     */
    public static Coffee create(CoffeeType type) {
        return switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
        };
    }
}
