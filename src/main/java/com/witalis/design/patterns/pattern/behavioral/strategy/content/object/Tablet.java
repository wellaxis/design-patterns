package com.witalis.design.patterns.pattern.behavioral.strategy.content.object;

import com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy.USBStrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name, new USBStrategy());
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
