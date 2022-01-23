package com.witalis.design.patterns.pattern.behavioral.specification.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Mobile extends Computer {

    public Mobile(String name, DeviceType type, DeviceSize size, DevicePrice price, DeviceCpu cpu) {
        super(name, type, size, price, cpu);
    }

    public Mobile(String name) {
        super(
            name,
            DeviceType.MOBILE,
            DeviceSize.SMALL,
            new DevicePrice(25_000.00),
            new DeviceCpu(4)
        );
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
