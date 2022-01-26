package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.device.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Everyday computer shop
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public class EverydayShop extends BaseShop {
    public static final double COFFEE_COEFFICIENT = 0.9;
    public static final double DEVICE_COEFFICIENT = 0.8;

    public EverydayShop(String name) {
        super(ShopRank.WORK, name);
        log.info("\t$ Welcome to everyday shop! We have all goods for home!");
    }

    @Override
    public Device createDevice(DeviceType type) {
        Device device = switch (type) {
            case LAPTOP -> new Laptop();
            case TABLET -> new Tablet();
            case MOBILE -> new Mobile();
        };

        log.info("\t$ It is a home device. It'll be used for everyday purposes.");

        // discount 20%
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

        log.info("\t$ It is an alcohol coffee. With alcohol additives! Relax a little.");

        // discount 10%
        BaseCoffee baseCoffee = (BaseCoffee) coffee;
        var price = baseCoffee.getPrice();
        baseCoffee.setPrice(price * COFFEE_COEFFICIENT);

        return coffee;
    }
}
