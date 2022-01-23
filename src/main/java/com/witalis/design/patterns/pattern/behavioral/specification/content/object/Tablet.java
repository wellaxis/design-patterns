package com.witalis.design.patterns.pattern.behavioral.specification.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Tablet extends Computer {

    public Tablet(String name, DeviceType type, DeviceSize size, DevicePrice price, DeviceCpu cpu) {
        super(name, type, size, price, cpu);
    }

    public Tablet(String name) {
        super(
            name,
            DeviceType.TABLET,
            DeviceSize.MIDDLE,
            new DevicePrice(10_000.00),
            new DeviceCpu(8)
        );
    }

    @Override
    public void use() {
        var specifiable = true;
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
