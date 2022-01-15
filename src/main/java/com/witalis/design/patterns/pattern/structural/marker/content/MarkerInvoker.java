package com.witalis.design.patterns.pattern.structural.marker.content;

import com.witalis.design.patterns.pattern.structural.marker.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker marker class
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
public class MarkerInvoker {

    public void invoke() {
        log.info("\tMarker: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // laptop
            Device laptop = new Laptop(1001, "Sony-Vaio", "Sony VAIO Pro SVP1321HGXBI");
            scenario(laptop);

            log.info("");

            // table
            Device tablet = new Tablet(1002, "Sony-Xperia", "Sony Xperia Tablet Z");
            scenario(tablet);

            log.info("");

            // mobile
            Device mobile = new Mobile(1003, "Sony-Walkman", "Sony Ericsson Walkman W200i");
            scenario(mobile);

            log.info("");

            // console
            Device console = new GameConsole(1004, "Sony-PS5", "Sony PlayStation 5");
            scenario(console);

            log.info("");

        } catch (Exception e) {
            log.error("\tMarker: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tMarker: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Device device) {
        log.info(
            "\t$ Device[{}] information:",
            device.getClass().getSimpleName().toLowerCase()
        );
        log.info("\t{}", device);
        device.use();
    }
}
