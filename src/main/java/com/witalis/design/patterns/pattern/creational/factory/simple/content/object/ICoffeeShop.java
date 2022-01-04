package com.witalis.design.patterns.pattern.creational.factory.simple.content.object;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.coffee.Coffee;
import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.coffee.CoffeeType;

/**
 * Desc: Coffee shop interface
 * User: Wellaxis
 * Date: 28.12.2021
 */
public interface ICoffeeShop {
    Coffee orderCoffee(CoffeeType type);
}
