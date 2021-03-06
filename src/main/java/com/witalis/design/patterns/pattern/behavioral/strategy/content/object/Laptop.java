package com.witalis.design.patterns.pattern.behavioral.strategy.content.object;

import com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy.PowerUnitStrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name, new PowerUnitStrategy());
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
