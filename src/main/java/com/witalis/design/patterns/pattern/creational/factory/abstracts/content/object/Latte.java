package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Latte coffee class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public final class Latte extends Coffee {
    public static final String DEF_NAME = "Latte coffee";
    public static final boolean DEF_HAS_MILK = true;
    public static final double DEF_PRICE = 7.0;
    public static final String DEF_NOTES =
        """
        A coffee drink of Italian origin made with espresso and steamed milk. \
        The term comes from the Italian caffellatte, literally 'coffee and milk'.""";

    public Latte() {
        this(DEF_NAME, DEF_HAS_MILK, DEF_PRICE, DEF_NOTES);
    }

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
