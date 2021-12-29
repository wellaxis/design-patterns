package com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: USB charging
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class USBCharging implements ChargingStrategy {

    @Override
    public void charge() {
        log.info("Universal Serial Bus charging. Very common!");
    }
}
