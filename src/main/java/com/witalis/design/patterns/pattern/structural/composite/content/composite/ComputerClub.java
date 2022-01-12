package com.witalis.design.patterns.pattern.structural.composite.content.composite;

import com.witalis.design.patterns.pattern.structural.composite.content.object.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Desc: Computer club as composite
 * User: Wellaxis
 * Date: 12.01.2022
 */
@Slf4j
@Data
public class ComputerClub implements Device {
    private String name;
    private Map<UUID, Device> devices;

    public ComputerClub(String name) {
        this.name = name;
        this.devices = new HashMap<>();
        log.info("\t!$! New computer club '{}' opened !$!", name);
    }

    public Device get(UUID id) {
        if (id != null && devices.containsKey(id)) {
            return devices.get(id);
        }
        return null;
    }

    public void add(Device device) {
        UUID id;
        if (device instanceof Computer computer) {
            id = computer.getId();
        } else {
            id = UUID.randomUUID();
        }
        devices.put(id, device);
    }

    public void remove(UUID id) {
        if (id != null && devices.containsKey(id)) {
            devices.remove(id);
        }
    }

    public void clear() {
        devices.clear();
    }

    public void output() {
        log.info("\tList of {}'s devices:", getName());
        if (devices.isEmpty()) {
            log.info("\t--- no active devices found ---");
            return;
        }
        devices.forEach(
            (id, device) -> log.info("\t=> {}", device.toString())
        );
    }

    @Override
    public void use() {
        devices.forEach(
            (id, device) -> {
                if (device instanceof Computer computer) {
                    log.info("\t{}> Prepare to use in club...", computer.getName().toLowerCase());
                }
                device.use();
            }
        );
    }
}
