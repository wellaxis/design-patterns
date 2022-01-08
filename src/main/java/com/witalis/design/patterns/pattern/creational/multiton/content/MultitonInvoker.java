package com.witalis.design.patterns.pattern.creational.multiton.content;

import com.witalis.design.patterns.pattern.creational.multiton.content.multiton.*;
import com.witalis.design.patterns.pattern.creational.multiton.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker multiton pattern
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
public class MultitonInvoker {

    public void invoke() {
        log.info("\tMultiton: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            DeviceMultiton.statistics();

            log.info("");

            // laptop
            log.info("\t# Laptop processing:");
            scenario(DeviceType.LAPTOP);

            log.info("");

            // tablet
            log.info("\t# Tablet processing:");
            scenario(DeviceType.TABLET);

            log.info("");

            // mobile
            log.info("\t# Mobile processing:");
            scenario(DeviceType.MOBILE);

            log.info("");

        } catch (Exception e) {
            log.error("\tMultiton: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tMultiton: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(DeviceType type) {
        var device = DeviceMultiton.getInstance(type);
        device.use();
        DeviceMultiton.statistics();

        var attempt = DeviceMultiton.getInstance(type);
        log.info(
            "\t@ Is {} equals to its repeat attempt? {}",
            type.name().toLowerCase(),
            device.equals(attempt)
        );
        DeviceMultiton.statistics();
    }
}
