package com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Wireless charging
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class WirelessCharging implements ChargingStrategy {

    @Override
    public void charge() {
        log.info("Wireless device charging. It's really convenient!");
    }
}
