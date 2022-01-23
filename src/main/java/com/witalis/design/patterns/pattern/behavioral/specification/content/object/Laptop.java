package com.witalis.design.patterns.pattern.behavioral.specification.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Laptop extends Computer {

    public Laptop(String name, DeviceType type, DeviceSize size, DevicePrice price, DeviceCpu cpu) {
        super(name, type, size, price, cpu);
    }

    public Laptop(String name) {
        super(
            name,
            DeviceType.LAPTOP,
            DeviceSize.LARGE,
            new DevicePrice(70_000.00),
            new DeviceCpu(16)
        );
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
