package com.witalis.design.patterns.pattern.creational.factory.method.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Everyday computer shop
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class EverydayShop extends ComputerShop {
    public static final double COEFFICIENT = 0.8;

    public EverydayShop() {
        super(DeviceRank.WORK);
        log.info("\t$ Welcome to everyday shop! We have all devices for home!");
    }

    @Override
    public Device create(DeviceType type) {
        Device device = switch (type) {
            case LAPTOP -> new Laptop();
            case TABLET -> new Tablet();
            case MOBILE -> new Mobile();
        };

        log.info("\t$ It is a home device. It'll be used for everyday purposes.");

        // discount 20%
        Computer computer = (Computer) device;
        var price = computer.getPrice();
        computer.setPrice(price * COEFFICIENT);

        return device;
    }
}
