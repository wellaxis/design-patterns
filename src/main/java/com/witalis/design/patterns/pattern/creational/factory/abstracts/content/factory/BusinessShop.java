package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.device.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Business shop
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public class BusinessShop extends BaseShop {
    public static final double COFFEE_COEFFICIENT = 0;
    public static final double DEVICE_COEFFICIENT = 1.3;

    public BusinessShop(String name) {
        super(ShopRank.WORK, name);
        log.info("\t$ Welcome to business shop! We have all goods for work!");
    }

    @Override
    public Device createDevice(DeviceType type) {
        Device device = switch (type) {
            case LAPTOP -> new Laptop();
            case TABLET -> new Tablet();
            case MOBILE -> new Mobile();
        };

        log.info("\t$ It is a work device. It'll be used for business purposes.");

        // extra charge 30%
        Computer computer = (Computer) device;
        var price = computer.getPrice();
        computer.setPrice(price * DEVICE_COEFFICIENT);

        return device;
    }

    @Override
    protected Coffee createCoffee(CoffeeType type) {
        Coffee coffee = switch (type) {
            case ESPRESSO -> new Espresso();
            case AMERICANO -> new Americano();
            case CAPPUCCINO -> new Cappuccino();
            case LATTE -> new Latte();
        };

        log.info("\t$ It is a classic coffee. No additives or frills! Business only.");

        // free of charge
        BaseCoffee baseCoffee = (BaseCoffee) coffee;
        var price = baseCoffee.getPrice();
        baseCoffee.setPrice(price * COFFEE_COEFFICIENT);

        return coffee;
    }
}
