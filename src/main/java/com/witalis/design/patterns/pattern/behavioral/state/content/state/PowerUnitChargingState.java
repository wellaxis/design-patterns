package com.witalis.design.patterns.pattern.behavioral.state.content.state;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Power unit charging
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class PowerUnitChargingState implements ChargingState {

    @Override
    public void charge() {
        log.info("Power unit charging. Need different adapters!");
    }
}
