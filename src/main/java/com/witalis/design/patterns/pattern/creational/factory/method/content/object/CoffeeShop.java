package com.witalis.design.patterns.pattern.creational.factory.method.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Coffee shop as client
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public abstract class CoffeeShop implements ICoffeeShop {
    private final CoffeeStyle style;

    protected CoffeeShop(CoffeeStyle style) {
        this.style = style;
    }

    /**
     * Abstract factory method to create an entity instance.
     * <p/>
     * @param type the type of required entity
     * @return the instance of required entity
     */
    public abstract Coffee createCoffee(CoffeeType type);

    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.grind();
        coffee.make();
        coffee.milk();
        coffee.pour();

        log.info("{} coffee is ready =)", getStyle());
        return coffee;
    }

    private String getStyle() {
        return style.name().substring(0, 1).toUpperCase()
            + style.name().substring(1).toLowerCase();
    }
}
