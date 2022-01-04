package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory.AlcoholicCafe;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory.ClassicCafe;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory.ExoticCafe;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory.InstantCafe;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Coffee shop as client
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public abstract class Cafe implements ICafe {
    private final CafeStyle style;

    protected Cafe(CafeStyle style) {
        this.style = style;
    }

    /**
     * Abstract factory method to create a first entity instance.
     * A family of related multiple entities.
     * <p/>
     * @param type the type of required entity N1
     * @return the instance of required entity N1
     */
    protected abstract Coffee createCoffee(CoffeeType type);

    /**
     * Abstract factory method to create a second entity instance.
     * A family of related multiple entities.
     * <p/>
     * @param type the type of required entity N2
     * @return the instance of required entity N2
     */
    protected abstract Tea createTea(TeaType type);

    @Override
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.grind();
        coffee.make();
        coffee.milk();
        coffee.pour();

        log.info("{} coffee is ready =)", getStyle());
        return coffee;
    }

    @Override
    public Tea orderTea(TeaType type) {
        Tea tea = createTea(type);

        tea.brew();
        tea.make();
        tea.pour();

        log.info("{} tea is ready =)", getStyle());
        return tea;
    }

    private String getStyle() {
        return style.name().substring(0, 1).toUpperCase()
            + style.name().substring(1).toLowerCase();
    }

    public static Cafe create(CafeStyle style) {
        return switch (style) {
            case CLASSIC -> new ClassicCafe();
            case EXOTIC -> new ExoticCafe();
            case INSTANT -> new InstantCafe();
            case ALCOHOLIC -> new AlcoholicCafe();
        };
    }
}
