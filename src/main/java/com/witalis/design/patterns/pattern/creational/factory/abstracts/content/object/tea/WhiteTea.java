package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: White tea class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public final class WhiteTea extends Tea {
    public static final String DEF_NAME = "White tea";
    public static final boolean DEF_HAS_SUGAR = true;
    public static final double DEF_PRICE = 8.0;
    public static final String DEF_NOTES =
        """
        White tea may refer to one of several styles of tea which generally \
        feature young or minimally processed leaves of the 'Camellia sinensis' plant.""";

    public WhiteTea() {
        this(DEF_NAME, DEF_HAS_SUGAR, DEF_PRICE, DEF_NOTES);
    }

    public WhiteTea(String name, boolean sugar, double price, String notes) {
        super(name, sugar, price, notes);
    }

    @Override
    public void make() {
        log.info("Generally, one cup is put from 2 to 10 grams of tea, the water temperature is 60-65 °C.");
    }
}
