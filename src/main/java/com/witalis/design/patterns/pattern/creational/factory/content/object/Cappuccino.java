package com.witalis.design.patterns.pattern.creational.factory.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Cappuccino coffee class
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public final class Cappuccino extends Coffee {

    public Cappuccino(String name, boolean milk, double price, String notes) {
        super(name, milk, price, notes);
    }

    @Override
    public void milk() {
        log.info("Need a little of milk");
    }

    @Override
    public void make() {
        log.info("Add the warmed and steam-foamed milk to one shot of espresso.");
    }
}
