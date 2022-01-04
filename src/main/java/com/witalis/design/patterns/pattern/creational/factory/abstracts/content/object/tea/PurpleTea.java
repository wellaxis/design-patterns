package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Purple tea class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public final class PurpleTea extends Tea {
    public static final String DEF_NAME = "Purple tea";
    public static final boolean DEF_HAS_SUGAR = false;
    public static final double DEF_PRICE = 13.3;
    public static final String DEF_NOTES =
        """
        Butterfly pea flower tea, commonly known as blue tea, is a caffeine-free herbal tea, \
        or tisane, beverage made from a decoction or infusion of the flower petals \
        or even whole flower of the Clitoria ternatea plant.""";

    public PurpleTea() {
        this(DEF_NAME, DEF_HAS_SUGAR, DEF_PRICE, DEF_NOTES);
    }

    public PurpleTea(String name, boolean sugar, double price, String notes) {
        super(name, sugar, price, notes);
    }

    @Override
    public void make() {
        log.info("Generally, place 5 flowers in 300 ml of hot water at 90 °C.");
    }
}
