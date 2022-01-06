package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public abstract class Computer implements Device {
    private final String name;
    private ChargingState chargingState;

    protected Computer(String name, ChargingState chargingState) {
        this.name = name;
        this.chargingState = chargingState;
    }

    public void setCharging(ChargingState chargingState) {
        this.chargingState = chargingState;
    }

    @Override
    public void turnOn() {
        log.info("Turn on {}", this);
    }

    @Override
    public void turnOff() {
        log.info("Turn off {}", this);
    }

    /**
     * To change state of object. Into class directly.
     */
    public void changeCharge() {
        if (chargingState instanceof PowerUnitChargingState) {
            setCharging(new USBChargingState());
        } else if (chargingState instanceof USBChargingState) {
            setCharging(new WirelessChargingState());
        } else if (chargingState instanceof WirelessChargingState) {
            setCharging(new PowerUnitChargingState());
        }
    }

    public void charge() {
        chargingState.charge();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName().toLowerCase() + ": [" + name + "]";
    }
}
