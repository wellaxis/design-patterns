package com.witalis.design.patterns.pattern.creational.factory.simple.content.object.coffee;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Espresso coffee class
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public final class Espresso extends Coffee {
    public static final String DEF_NAME = "Espresso coffee";
    public static final boolean DEF_HAS_MILK = false;
    public static final double DEF_PRICE = 2.5;
    public static final String DEF_NOTES =
        """
        A coffee-brewing method of Italian origin, in which a small amount of nearly boiling water \
        is forced under 9–10 bars of pressure (expressed) through finely-ground coffee beans.""";

    public Espresso() {
        this(DEF_NAME, DEF_HAS_MILK, DEF_PRICE, DEF_NOTES);
    }

    public Espresso(String name, boolean milk, double price, String notes) {
        super(name, milk, price, notes);
    }

    @Override
    public void milk() {
        log.info("No need to add milk");
    }

    @Override
    public void make() {
        log.info("Coffee can be made with a wide variety of coffee beans and roast degrees.");
    }
}
