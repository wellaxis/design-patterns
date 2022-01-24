package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Desc: Device master
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Data
public abstract class DeviceMaster implements Master {
    private final String name;
    private final List<DeviceType> specializations;
    private final Workshop workshop;

    protected DeviceMaster(String name, List<DeviceType> specializations, Workshop workshop) {
        this.name = name;
        this.specializations = specializations;
        this.workshop = workshop;
    }

    @Override
    public int getSkills() {
        return specializations.size();
    }

    @Override
    public boolean canFix(Device device) {
        boolean possible = specializations.contains(device.getType());
        if (possible) {
            log.info("\t# Master {}: I can fix this device {}", getName(), device.getName());
        }
        return possible;
    }

    @Override
    public void fix(Device device) {
        repair(device);
        getWorkshop().acceptDevice(device);
    }

    public abstract void repair(Device device);
}
