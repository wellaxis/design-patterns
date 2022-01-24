package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.Device;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc: Device manager
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Data
public abstract class DeviceManager implements Manager {
    private final String name;
    private Map<String, Master> masters = new HashMap<>();

    protected DeviceManager(String name) {
        this.name = name;
    }

    @Override
    public void hireMaster(Master master) {
        masters.put(master.getName(), master);
        log.info("\t$ Manager: the new device master '{}' has been hired", master.getName());
    }

    @Override
    public void fireMaster(Master master) {
        masters.remove(master.getName());
        log.info("\t$ Manager: the device master '{}' has been fired", master.getName());
    }

    @Override
    public void registerDevice(Device device) {
        log.info("\t$ Manager: the device '{}' is ready for fixing...", device.getName());
        delegateFixing(device);
    }

    public abstract void delegateFixing(Device device);
}
