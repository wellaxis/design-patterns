package com.witalis.design.patterns.pattern.creational.factory.simple.content.object;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.factory.CoffeeFactory;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Coffee shop as client
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public class CoffeeShop implements ICoffeeShop {

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = CoffeeFactory.produce(type);

        coffee.grind();
        coffee.make();
        coffee.milk();
        coffee.pour();

        log.info("Coffee is ready =)");
        return coffee;
    }
}
