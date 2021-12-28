package com.witalis.design.patterns.pattern.creational.factory.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Americano coffee class
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public final class Americano extends Coffee {

    public Americano(String name, boolean milk, double price, String notes) {
        super(name, milk, price, notes);
    }

    @Override
    public void milk() {
        log.info("No need to add milk");
    }

    @Override
    public void make() {
        log.info("Add single or double shot of espresso brewed with added hot water.");
    }
}
