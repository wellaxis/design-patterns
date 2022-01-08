package com.witalis.design.patterns.pattern.creational.multiton.content.multiton;

import com.witalis.design.patterns.pattern.creational.multiton.content.object.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * Desc: Device multiton
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
@Data
public class DeviceMultiton implements Device {
    private UUID id;
    private String name;
    private boolean active;
    private DeviceType type;

    private static final Map<DeviceType, Device> instances = new HashMap<>();

    private DeviceMultiton(DeviceType type) {
        this.type = type;
        setId(UUID.randomUUID());
        setName(type.name().toLowerCase());
        setActive(true);
    }

    public static Device getInstance(DeviceType type) {
        if (!instances.containsKey(type)) {
            synchronized (DeviceMultiton.class) {
                Device device = new DeviceMultiton(type);
                instances.put(type, device);
            }
        }
        return instances.get(type);
    }

    @Override
    public void use() {
        log.info("\t> Turning on {}... Done.", getName());
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
        log.info("\t> Turning off {}... Done.", getName());
    }

    public static void statistics() {
        log.info("\t# Number of devices: {}", instances.size());
        instances.forEach(
            (key, value) -> log.info("\t\t- {} -> {}", key, value)
        );
    }
}
