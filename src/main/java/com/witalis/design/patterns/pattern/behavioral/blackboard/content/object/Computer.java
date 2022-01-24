package com.witalis.design.patterns.pattern.behavioral.blackboard.content.object;

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
    private final DeviceType type;
    private DeviceStatus status;

    protected Computer(String name, DeviceType type) {
        this.name = name;
        this.type = type;
        this.status = DeviceStatus.NEW;
    }

    @Override
    public void check() {
        switch (status) {
            case NEW -> log.info("\t# Device is new, feel free to use :)");
            case BROKEN -> log.info("\t# Device is broken, needs to be fixed :(");
            case FIXED -> log.info("\t# Device is fixed, use carefully ;)");
        }
    }

    @Override
    public String toString() {
        return "Device [" + getClass().getSimpleName().toLowerCase() + ": " + name + "]";
    }
}
