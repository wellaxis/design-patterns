package com.witalis.design.patterns.pattern.behavioral.servant.content.servant;

import com.witalis.design.patterns.pattern.behavioral.servant.content.object.Device;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Base session
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Data
public abstract class BaseSession implements Session {
    private UUID id;

    protected BaseSession() {
        this.id = UUID.randomUUID();
    }

    @Override
    public void prepare(Device device, boolean force) {
        if (!force) {
            device.charge();
        }
        device.turnOn();
        log.info("\t# Init session: {}", getId());
    }

    @Override
    public void complete(Device device, boolean force) {
        log.info("\t# Stop session: {}", getId());
        device.turnOff();
        if (!force) {
            device.clean();
        }
    }

    @Override
    public String toString() {
        return "Session [" + getClass().getSimpleName().toLowerCase() + ": " + id + "]";
    }
}
