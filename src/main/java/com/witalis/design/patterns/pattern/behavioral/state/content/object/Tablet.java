package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.USBChargingState;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name, new USBChargingState());
    }

    @Override
    public void use() {
        log.info("Play online game...");
        log.info("Watch a new film...");
    }
}
