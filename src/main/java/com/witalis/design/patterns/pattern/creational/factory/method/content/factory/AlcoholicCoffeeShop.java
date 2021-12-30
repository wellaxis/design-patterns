package com.witalis.design.patterns.pattern.creational.factory.method.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Alcoholic coffee shop
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class AlcoholicCoffeeShop extends CoffeeShop {

    public AlcoholicCoffeeShop() {
        super(CoffeeStyle.ALCOHOLIC);
    }

    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
        };

        log.info("It is an exotic coffee. With alcohol additives!");

        // extra charge 30%
        var price = coffee.getPrice();
        coffee.setPrice(price * 1.3);

        return coffee;
    }
}
