package com.witalis.design.patterns.pattern.behavioral.memento.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name, String comments, double price, int version) {
        super(name, comments, price, version);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.LAPTOP;
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
