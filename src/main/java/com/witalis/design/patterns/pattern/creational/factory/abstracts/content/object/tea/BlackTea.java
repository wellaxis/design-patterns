package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Black tea class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public final class BlackTea extends Tea {
    public static final String DEF_NAME = "Black tea";
    public static final boolean DEF_HAS_SUGAR = true;
    public static final double DEF_PRICE = 1.0;
    public static final String DEF_NOTES =
        """
        Black tea, also translated to red tea in various Asian languages, is a type of tea that is more oxidized than \
        oolong, yellow, white and green teas. Black tea is generally stronger in flavor than other teas.""";

    public BlackTea() {
        this(DEF_NAME, DEF_HAS_SUGAR, DEF_PRICE, DEF_NOTES);
    }

    public BlackTea(String name, boolean sugar, double price, String notes) {
        super(name, sugar, price, notes);
    }

    @Override
    public void make() {
        log.info("Generally, one uses 4 grams of tea per 200 ml of hot water.");
    }
}
