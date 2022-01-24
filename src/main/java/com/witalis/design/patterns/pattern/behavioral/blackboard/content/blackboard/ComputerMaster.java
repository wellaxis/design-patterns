package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Desc: Computer master
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class ComputerMaster extends DeviceMaster {

    public ComputerMaster(String name, List<DeviceType> specializations, Workshop workshop) {
        super(name, specializations, workshop);
    }

    public void repair(Device device) {
        device.check();
        Computer computer = (Computer) device;
        computer.setStatus(DeviceStatus.FIXED);
        log.info("\t> Master {}: I've fixed this device {}", getName(), device.getName());
    }
}
