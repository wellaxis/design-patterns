package com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Power unit charging
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class PowerUnitStrategy implements ChargingStrategy {

    @Override
    public void charge() {
        log.info("\t# Power unit charging. Need different adapters!");
    }
}
