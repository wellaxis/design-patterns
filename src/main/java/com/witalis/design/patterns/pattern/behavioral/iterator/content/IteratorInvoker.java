package com.witalis.design.patterns.pattern.behavioral.iterator.content;

import com.witalis.design.patterns.pattern.behavioral.iterator.content.iterator.*;
import com.witalis.design.patterns.pattern.behavioral.iterator.content.object.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Desc: Invoker iterator pattern
 * User: Wellaxis
 * Date: 22.02.2022
 */
@Slf4j
public class IteratorInvoker {

    public void invoke() {
        log.info("\tIterator: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // drivers
            List<String> drivers = List.of(
                "CPU", "Monitor", "Motherboard", "Sound", "Video", "Wifi"
            );

            // aggregator

            // laptop
            Computer laptop = new Laptop("Super laptop", 100);
            laptop.installDrivers(drivers);
            scenario(laptop);

            log.info("");

            // tablet
            Computer tablet = new Tablet("Power tablet", 100);
            tablet.installDrivers(drivers);
            tablet.installDriver("Network");
            tablet.uninstallDriver("Motherboard");
            scenario(tablet);

            log.info("");

            // mobile
            Computer mobile = new Mobile("Cheap mobile", 100);
            mobile.installDrivers(drivers);
            mobile.uninstallDrivers(List.of("Monitor", "Motherboard", "CPU"));
            mobile.installDrivers(List.of("Bluetooth", "SIM", "QR Scanner"));
            scenario(mobile);

            log.info("");

        } catch (Exception e) {
            log.error("\tIterator: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tIterator: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device) {
        if (device == null) return;

        log.info("\t =========== Devices:");
        log.info("\t {}", device.toString());

        log.info("\t =========== Drivers:");
        Iterator iterator = device.iterator();
        log.info("\t + First: {}", iterator.first());
        int counter = 0;
        while (iterator.hasNext()) {
            log.info("\t + Driver[{}]: {}", ++counter, iterator.next().toString());
        }
        log.info("\t + Last: {}", iterator.last());
        log.info("\t =========== Done.");
    }
}
