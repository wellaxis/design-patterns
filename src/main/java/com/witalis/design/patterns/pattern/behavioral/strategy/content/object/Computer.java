package com.witalis.design.patterns.pattern.behavioral.strategy.content.object;

import com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy.ChargingStrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public abstract class Computer implements Device {
    private final String name;
    private ChargingStrategy chargingStrategy;

    protected Computer(String name, ChargingStrategy chargingStrategy) {
        this.name = name;
        this.chargingStrategy = chargingStrategy;
    }

    public void setChargingStrategy(ChargingStrategy strategy) {
        this.chargingStrategy = strategy;
    }

    @Override
    public void turnOn() {
        log.info("Turn on {}", this);
    }

    @Override
    public void turnOff() {
        log.info("Turn off {}", this);
    }

    public void charge() {
        chargingStrategy.charge();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName().toLowerCase() + ": [" + name + "]";
    }
}
