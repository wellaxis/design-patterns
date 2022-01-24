package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc:
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Data
public abstract class DeviceWorkshop implements Workshop {
    private final String name;
    private Manager manager;
    private Map<String, Device> devices = new HashMap<>();

    protected DeviceWorkshop(String name) {
        this.name = name;
    }

    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
        log.info("\t! A new manager {} will control working process...", manager.getName());
    }

    @Override
    public void acceptDevice(Device device) {
        log.info("\t# Workshop: device to repair -> {}", device);
        boolean inspection = inspectDevice(device);
        if (inspection) {
            log.info("\t# Workshop: device needs a fix.");
            devices.put(device.getName(), device);
            notifyManager(device);
        } else {
            if (devices.containsKey(device.getName())) {
                devices.remove(device.getName());
                Computer computer = (Computer) device;
                DeviceStatus status = computer.getStatus();
                if (status.equals(DeviceStatus.FIXED)) {
                    log.info("\t# Workshop: device has been fixed. Thanks for business!");
                } else if (status.equals(DeviceStatus.DENY)) {
                    log.info("\t# Workshop: device hasn't been fixed. Sorry for business!");
                }
            } else {
                log.info("\t# Workshop: device doesn't need fixing.");
            }
        }
    }

    public abstract boolean inspectDevice(Device device);

    @Override
    public void notifyManager(Device device) {
        manager.registerDevice(device);
    }

    @Override
    public String toString() {
        String managerInfo = "";
        if (manager != null) {
            managerInfo = ", manager='" + manager.getName() + "'";
        }
        return "Workshop: [name='" + name + "'" + managerInfo + "]";
    }
}
