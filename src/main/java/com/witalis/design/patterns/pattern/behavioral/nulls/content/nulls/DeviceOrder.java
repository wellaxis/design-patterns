package com.witalis.design.patterns.pattern.behavioral.nulls.content.nulls;

import com.witalis.design.patterns.pattern.behavioral.nulls.content.object.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;

/**
 * Desc: Device order
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
public class DeviceOrder implements Order {
    private final int id;
    private List<Device> devices = new ArrayList<>();

    public DeviceOrder() {
        this.id = ThreadLocalRandom.current().nextInt(1_000, 10_000);
    }

    @Override
    public void order(List<Device> devices) {
        log.info("\t$ Order the list of devices...");
        List<Device> ordering = verify(devices);
        int number = ordering.size();
        int percentage = (number * 100 / devices.size());
        if (percentage >= REQ_PCT) {
            log.info("\t$ Status -> approve: enough devices [{}/{}] :)", number, devices.size());
            setDevices(ordering);
        } else {
            log.info("\t$ Status -> reject: not enough devices [{}/{}] :(", number, devices.size());
        }
    }

    public List<Device> verify(List<Device> devices) {
        List<Device> ordering = new ArrayList<>();

        log.info("\t$ Verification -> started");
        log.info("\t--------------------------");
        for (int i = 1; i <= devices.size(); i++) {
            Device device = devices.get(i - 1);
            var name = device.name();
            if (device instanceof NullDevice) {
                log.info("\t[{}][-]> unfortunately the {} is missing...", i, name);
            } else {
                log.info("\t[{}][+]> check of {} in progress, wait...", i, name);
                device.use();
                ordering.add(device);
            }
        }
        log.info("\t--------------------------");
        log.info("\t$ Verification -> finished");

        return ordering;
    }

    @Override
    public String toString() {
        StringBuilder devicesInfo = new StringBuilder("stats: ");
        var groups = devices.stream().collect(Collectors.groupingBy(Device::name));
        groups.forEach(
            (key, value) -> devicesInfo.append(value.size()).append(" ").append(key).append("s, ")
        );
        devicesInfo.append("=> done");
        return "Order [id=" + id + ", devices='" + devicesInfo + "']";
    }
}
