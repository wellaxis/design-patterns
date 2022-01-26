package com.witalis.design.patterns.pattern.creational.factory.method.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Prestige computer shop
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class PrestigeShop extends ComputerShop {
    public static final double COEFFICIENT = 1.5;

    public PrestigeShop() {
        super(DeviceRank.WORK);
        log.info("\t$ Welcome to prestige shop! We have all devices for game!");
    }

    @Override
    public Device create(DeviceType type) {
        Device device = switch (type) {
            case LAPTOP -> new Laptop();
            case TABLET -> new Tablet();
            case MOBILE -> new Mobile();
        };

        log.info("\t$ It is a game device. It'll be used for gaming purposes.");

        // extra charge 50%
        Computer computer = (Computer) device;
        var price = computer.getPrice();
        computer.setPrice(price * COEFFICIENT);

        return device;
    }
}
