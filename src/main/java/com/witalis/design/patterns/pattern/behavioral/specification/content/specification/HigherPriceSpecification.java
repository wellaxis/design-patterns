package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.*;

/**
 * Desc: Higher price specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class HigherPriceSpecification extends CompositeSpecification {
    private final DevicePrice price;

    public HigherPriceSpecification(DevicePrice price) {
        this.price = price;
    }

    @Override
    public boolean specify(Device device) {
        if (device == null || price == null) return false;
        return device.getPrice().getPrice() >= price.getPrice();
    }
}
