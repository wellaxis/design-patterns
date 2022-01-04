package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Exotic coffee shop
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public class ExoticCafe extends Cafe {
    public static final double coefficient = 1.1;

    public ExoticCafe() {
        super(CafeStyle.EXOTIC);
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

        log.info("It is an exotic tea. With lemon & flowers!");

        // discount 10%
        var price = tea.getPrice();
        tea.setPrice(price * coefficient);

        return tea;
    }
}
