package com.witalis.design.patterns.pattern.creational.factory.method.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;
import com.witalis.design.patterns.pattern.creational.factory.method.content.object.coffee.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Classic coffee shop
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class ClassicCoffeeShop extends CoffeeShop {

    public ClassicCoffeeShop() {
        super(CoffeeStyle.CLASSIC);
    }

    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
        };

        log.info("It is a classic coffee. No additives or frills!");

        // discount 10%
        var price = coffee.getPrice();
        coffee.setPrice(price * 0.9);

        return coffee;
    }
}
