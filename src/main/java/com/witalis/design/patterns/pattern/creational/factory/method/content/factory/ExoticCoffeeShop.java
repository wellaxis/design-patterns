package com.witalis.design.patterns.pattern.creational.factory.method.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Exotic coffee shop
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class ExoticCoffeeShop extends CoffeeShop {

    public ExoticCoffeeShop() {
        super(CoffeeStyle.EXOTIC);
    }

    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
        };

        log.info("It is an exotic coffee. With fruits & marshmallows!");

        // extra charge 10%
        var price = coffee.getPrice();
        coffee.setPrice(price * 1.1);

        return coffee;
    }
}
