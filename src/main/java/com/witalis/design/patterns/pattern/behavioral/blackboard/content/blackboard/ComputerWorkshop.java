package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer workshop
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class ComputerWorkshop extends DeviceWorkshop {

    public ComputerWorkshop(String name) {
        super(name);
        log.info("\t! A new workshop {} is open & new orders are being taken...", getName());
    }

    @Override
    public boolean inspectDevice(Device device) {
        if (device == null) return false;

        var computer = (Computer) device;
        var status = computer.getStatus();
        if (status.equals(DeviceStatus.NEW)) {
            log.info("\t> Inspection: device is new & does not need verification.");
        } else if (status.equals(DeviceStatus.FIXED)) {
            log.info("\t> Inspection: device is fixed now & it works successfully.");
        }
        return computer.getStatus().equals(DeviceStatus.BROKEN);
    }
}
