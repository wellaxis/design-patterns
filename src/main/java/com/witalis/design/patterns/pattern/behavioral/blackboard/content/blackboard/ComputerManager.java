package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.*;

import lombok.extern.slf4j.Slf4j;

import java.util.Comparator;
import java.util.Optional;

/**
 * Desc: Computer manager
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class ComputerManager extends DeviceManager {
    private SecretaryMaster secretary;

    public ComputerManager(String name) {
        super(name);
    }

    public SecretaryMaster getSecretary() {
        return secretary;
    }

    public void setSecretary(SecretaryMaster secretary) {
        this.secretary = secretary;
        log.info("\t$ Manager: the new secretary '{}' has been hired", secretary.getName());
    }

    @Override
    public void delegateFixing(Device device) {
        Optional<Master> deviceMaster = getMasters().values().stream()
            .sorted(Comparator.comparing(Master::getSkills))
            .filter(master -> master.canFix(device))
            .findFirst();
        if (deviceMaster.isPresent()) {
            Master fixMaster = deviceMaster.get();
            log.info("\t> Manager: master {} will fix this device {}", fixMaster.getName(), device.getName());
            fixMaster.fix(device);
        } else {
            log.info("\t> Manager: unfortunately we can't fix this device {}", device.getName());
            secretary.fix(device);
        }
    }
}
