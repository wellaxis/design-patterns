package com.witalis.design.patterns.pattern.behavioral.blackboard.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name, DeviceType.LAPTOP);
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Define computer settings...");
    }
}
