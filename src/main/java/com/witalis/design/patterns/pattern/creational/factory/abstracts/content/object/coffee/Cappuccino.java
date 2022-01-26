package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Cappuccino realCoffee class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class Cappuccino extends BaseCoffee {
    public static final String DEF_NAME = "Cappuccino coffee";
    public static final boolean DEF_HAS_MILK = true;
    public static final double DEF_PRICE = 5.5;
    public static final String DEF_NOTES =
        """
        An espresso-based realCoffee drink that originated in Austria with later development \
        taking place in Italy, and is prepared with steamed milk foam (micro-foam).""";

    public Cappuccino() {
        this(DEF_NAME, DEF_HAS_MILK, DEF_PRICE, DEF_NOTES);
    }

    public Cappuccino(String name, boolean milk, double price, String notes) {
        super(name, milk, price, notes);
    }

    @Override
    public void milk() {
        log.info("\t# Need a little of milk");
    }

    @Override
    public void make() {
        log.info("\t# Add the warmed and steam-foamed milk to one shot of espresso.");
    }
}
