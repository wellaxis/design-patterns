package com.witalis.design.patterns.pattern.behavioral.servant.content.object;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Data
public abstract class Computer implements Device {
    private final String name;

    protected Computer(String name) {
        this.name = name;
    }

    @Override
    public void turnOn() {
        log.info("\t+ Turn on computer device");
    }

    @Override
    public void turnOff() {
        log.info("\t- Turn off computer device");
    }

    @Override
    public String toString() {
        return "Device [" + getClass().getSimpleName().toLowerCase() + ": " + name + "]";
    }
}
