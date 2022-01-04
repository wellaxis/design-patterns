package com.witalis.design.patterns.pattern.creational.factory.method.content.object;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.coffee.Coffee;
import com.witalis.design.patterns.pattern.creational.factory.method.content.object.coffee.CoffeeType;

/**
 * Desc: Coffee shop interface
 * User: Wellaxis
 * Date: 30.12.2021
 */
public interface ICoffeeShop {
    Coffee orderCoffee(CoffeeType type);
}
