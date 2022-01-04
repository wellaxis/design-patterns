package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Green tea class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public final class GreenTea extends Tea {
    public static final String DEF_NAME = "Green tea";
    public static final boolean DEF_HAS_SUGAR = false;
    public static final double DEF_PRICE = 4.5;
    public static final String DEF_NOTES =
        """
        Green tea is a type of tea that is made from 'Camellia sinensis' leaves and buds that have not undergone \
        the same withering and oxidation process used to make oolong teas and black teas.""";

    public GreenTea() {
        this(DEF_NAME, DEF_HAS_SUGAR, DEF_PRICE, DEF_NOTES);
    }

    public GreenTea(String name, boolean sugar, double price, String notes) {
        super(name, sugar, price, notes);
    }

    @Override
    public void make() {
        log.info("Generally, using 2 grams of tea per 100 ml of hot water.");
    }
}
