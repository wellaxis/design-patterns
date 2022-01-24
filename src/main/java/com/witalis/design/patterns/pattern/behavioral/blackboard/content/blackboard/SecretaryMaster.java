package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Desc: Secretary master
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class SecretaryMaster extends DeviceMaster {

    public SecretaryMaster(String name, List<DeviceType> specializations, Workshop workshop) {
        super(name, specializations, workshop);
    }

    @Override
    public boolean canFix(Device device) {
        return false;
    }

    public void repair(Device device) {
        Computer computer = (Computer) device;
        computer.setStatus(DeviceStatus.DENY);
        log.info("\t> Secretary {}: Certificate of fixing denial...", getName());
    }
}
