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
    private Charging charging;

    protected Computer(String name, Charging charging) {
        this.name = name;
        this.charging = charging;
    }

    public void setCharging(Charging charging) {
        this.charging = charging;
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
        if (charging instanceof PowerUnitCharging) {
            setCharging(new USBCharging());
        } else if (charging instanceof USBCharging) {
            setCharging(new WirelessCharging());
        } else if (charging instanceof WirelessCharging) {
            setCharging(new PowerUnitCharging());
        }
    }

    public void charge() {
        charging.charge();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName().toLowerCase() + ": [" + name + "]";
    }
}
