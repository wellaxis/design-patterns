package com.witalis.design.patterns.pattern.behavioral.mediator.content.mediator;

import com.witalis.design.patterns.pattern.behavioral.mediator.content.object.Device;

import lombok.extern.slf4j.Slf4j;
import java.util.ArrayList;
import java.util.List;

/**
 * Desc: Device messenger
 * User: Wellaxis
 * Date: 21.01.2022
 */
@Slf4j
public class Messenger implements Mediator {
    private String name;
    private List<Device> devices;

    public Messenger(String name) {
        this.name = name;
        this.devices = new ArrayList<>();
    }

    public void registerDevice(Device device) {
        devices.add(device);
    }

    public void unregisterDevice(Device device) {
        devices.remove(device);
    }

    @Override
    public void mediate(Device device, String message) {
        devices.stream()
            .filter(d -> !d.equals(device))
            .forEach(d -> d.readMessage(message));
    }

    @Override
    public String toString() {
        return "Device [messenger: name='" + name + "', size=" + devices.size() + "]";
    }
}
