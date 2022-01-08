package com.witalis.design.patterns.pattern.creational.pool.content.pool;

import com.witalis.design.patterns.pattern.creational.pool.content.object.*;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc: Computer pool
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
public final class ComputerPool implements DevicePool {
    private static Map<Device, Long> available = new HashMap<>();
    private static Map<Device, Long> processing = new HashMap<>();

    // receive -> take device from pool or create a new one
    public static synchronized Device receive() {
        long now = System.currentTimeMillis();

        if (!available.isEmpty()) {
            for (Map.Entry<Device, Long> entry : available.entrySet()) {
                if (now - entry.getValue() > expireTime) {
                    // remove from pool due to expiration
                    remove(available, entry.getKey());
                } else {
                    Device device = remove(available, entry.getKey());
                    add(processing, device, now);

                    return device;
                }
            }
        }

        return create(now);
    }

    // release -> move device from processing to available map
    public static void release(Device device) {
        available.put(device, System.currentTimeMillis());
        processing.remove(device);
    }

    // terminate -> cleaning as finalization of the pool use
    public static void terminate() {
        available.clear();
        processing.clear();
    }

    // put device into required map to store
    private static synchronized void add(Map<Device, Long> map, Device device, long time) {
        map.put(device, time);
    }

    // remove device from a required map
    private static Device remove(Map<Device, Long> map, Device key) {
        map.remove(key);
        return key;
    }

    // initiate device & store into processing map
    private static synchronized Device create(long time) {
        Computer device = new Computer();
        device.setName("The " + (processing.size() + 1) + "th");
        add(processing, device, time);
        return device;
    }

    // stats -> check content of computer pool
    public static void statistics() {
        log.info("\t# Available devices: {}", available.size());
        available.forEach(
            (key, value) -> log.info("\t\t- {} -> {}", key, value)
        );

        log.info("\t# Processing devices: {}", processing.size());
        processing.forEach(
            (key, value) -> log.info("\t\t- {} -> {}", key, value)
        );
    }
}
