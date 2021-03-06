package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Americano coffee class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class Americano extends BaseCoffee {
    public static final String DEF_NAME = "Americano coffee";
    public static final boolean DEF_HAS_MILK = false;
    public static final double DEF_PRICE = 3.0;
    public static final String DEF_NOTES =
        """
        A type of coffee drink prepared by diluting an espresso with hot water, \
        giving it a similar strength to, but different flavor from, traditionally brewed coffee.""";

    public Americano() {
        this(DEF_NAME, DEF_HAS_MILK, DEF_PRICE, DEF_NOTES);
    }

    public Americano(String name, boolean milk, double price, String notes) {
        super(name, milk, price, notes);
    }

    @Override
    public void milk() {
        log.info("\t# No need to add milk");
    }

    @Override
    public void make() {
        log.info("\t# Add single or double shot of espresso brewed with added hot water.");
    }
}
