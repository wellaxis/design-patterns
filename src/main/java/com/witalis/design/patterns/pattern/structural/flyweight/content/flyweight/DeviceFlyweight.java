package com.witalis.design.patterns.pattern.structural.flyweight.content.flyweight;

import com.witalis.design.patterns.pattern.structural.flyweight.content.object.*;

import lombok.extern.slf4j.Slf4j;
import java.util.HashMap;
import java.util.Map;

/**
 * Desc: Flyweight device factory
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class DeviceFlyweight {
    private static final Map<DeviceType, Map<Integer, Device>> devices;

    static {
        devices = new HashMap<>();
        devices.put(DeviceType.LAPTOP, new HashMap<>());
        devices.put(DeviceType.TABLET, new HashMap<>());
        devices.put(DeviceType.MOBILE, new HashMap<>());
    }

    public Device getDeviceByType(DeviceType type, int id) {
        Device device = devices.get(type).get(id);
        if (device == null) {
            switch (type) {
                case LAPTOP -> {
                    log.info("\t$ Purchase a new laptop");
                    device = new Laptop(id, "laptop-" + id);
                }
                case TABLET -> {
                    log.info("\t$ Purchase a new tablet");
                    device = new Tablet(id, "tablet-" + id);
                }
                case MOBILE -> {
                    log.info("\t$ Purchase a new mobile");
                    device = new Mobile(id, "mobile-" + id);
                }
            }
            devices.get(type).put(id, device);
        }
        return device;
    }
}
