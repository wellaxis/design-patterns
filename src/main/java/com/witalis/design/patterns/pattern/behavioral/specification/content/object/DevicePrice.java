package com.witalis.design.patterns.pattern.behavioral.specification.content.object;

import lombok.Data;

/**
 * Desc: Device price
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Data
public class DevicePrice {
    private volatile double price;

    public DevicePrice(double price) {
        this.price = price;
    }
}
