package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object;

/**
 * Desc: Coffee shop interface
 * User: Wellaxis
 * Date: 31.12.2021
 */
public interface ICoffeeShop {
    Coffee createCoffee(CoffeeType type);
    Coffee orderCoffee(CoffeeType type);
}
