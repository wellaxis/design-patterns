package com.witalis.design.patterns.pattern.creational.factory.method.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Cappuccino coffee class
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public final class Cappuccino extends Coffee {
    public static final String DEF_NAME = "Cappuccino coffee";
    public static final boolean DEF_HAS_MILK = true;
    public static final double DEF_PRICE = 5.5;
    public static final String DEF_NOTES =
        """
        An espresso-based coffee drink that originated in Austria with later development \
        taking place in Italy, and is prepared with steamed milk foam (micro-foam).""";

    public Cappuccino() {
        this(DEF_NAME, DEF_HAS_MILK, DEF_PRICE, DEF_NOTES);
    }

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
