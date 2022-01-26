package com.witalis.design.patterns.pattern.creational.factory.method.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Business computer shop
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class BusinessShop extends ComputerShop {
    public static final double COEFFICIENT = 1.3;

    public BusinessShop() {
        super(DeviceRank.WORK);
        log.info("\t$ Welcome to business shop! We have all devices for work!");
    }

    @Override
    public Device create(DeviceType type) {
        Device device = switch (type) {
            case LAPTOP -> new Laptop();
            case TABLET -> new Tablet();
            case MOBILE -> new Mobile();
        };

        log.info("\t$ It is a work device. It'll be used for business purposes.");

        // extra charge 30%
        Computer computer = (Computer) device;
        var price = computer.getPrice();
        computer.setPrice(price * COEFFICIENT);

        return device;
    }
}
