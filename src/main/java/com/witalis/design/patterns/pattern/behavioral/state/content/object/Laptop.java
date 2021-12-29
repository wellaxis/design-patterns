package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.PowerUnitCharging;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name, new PowerUnitCharging());
    }

    @Override
    public void use() {
        log.info("Operation system loading...");
        log.info("Develop computer program...");
    }
}
