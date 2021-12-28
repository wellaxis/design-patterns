package com.witalis.design.patterns.pattern.creational.factory.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Latte coffee class
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public final class Latte extends Coffee {

    public Latte(String name, boolean milk, double price, String notes) {
        super(name, milk, price, notes);
    }

    @Override
    public void milk() {
        log.info("Need a lot of milk");
    }

    @Override
    public void make() {
        log.info("Make with milk, forming a three-layer mixture of milk, espresso and foam in a cup.");
    }
}
