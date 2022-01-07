package com.witalis.design.patterns.pattern.creational.lazy.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private double price;
    private boolean active;

    private static ConcurrentHashMap<DeviceType, Device> devices = new ConcurrentHashMap<>();

    protected Computer() {
        this.id = UUID.randomUUID();
    }

    /**
     * Unable to use constructor to force the use of the factory method.
     * <p/>
     * @param type a particular device type for initialization
     */
    private Computer(DeviceType type) {
        this();
    }

    /**
     * Static method for lazy initialization & cache storing.
     * <p/>
     * @param type a particular device type for initialization
     * @return the initialized device instance by its type
     */
    public static Device getDeviceByType(DeviceType type) {
        Device device;

        if (!devices.containsKey(type)) {
            // lazy initialization
            device = switch (type) {
                case LAPTOP -> new Laptop();
                case TABLET -> new Tablet();
                case MOBILE -> new Mobile();
            };
            // store in memory cache
            devices.put(type, device);
        } else {
            // already initialized
            device = devices.get(type);
        }

        return device;
    }

    public static void showDevices() {
        log.info("\t# Number of devices: {}", devices.size());
        devices.forEach(
            (key, value) -> log.info("\t\t- {} -> {}", key, value)
        );
    }
}
