package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Instant coffee shop
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public class InstantCafe extends Cafe {
    public static final double coefficient = 0.75;

    public InstantCafe() {
        super(CafeStyle.INSTANT);
    }

    @Override
    public Coffee createCoffee(CoffeeType type) {
        Coffee coffee = switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
        };

        log.info("It is an instant coffee. Cheap and fast!");

        // discount 25%
        var price = coffee.getPrice();
        coffee.setPrice(price * coefficient);

        return coffee;
    }

    @Override
    public Tea createTea(TeaType type) {
        Tea tea = switch (type) {
            case BLACK -> new BlackTea();
            case GREEN -> new GreenTea();
            case WHITE -> new WhiteTea();
            case PURPLE -> new PurpleTea();
        };

        log.info("It is a tea from bag. Cheap and fast!");

        // discount 25%
        var price = tea.getPrice();
        tea.setPrice(price * coefficient);

        return tea;
    }
}
