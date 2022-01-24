package com.witalis.design.patterns.pattern.structural.data.content;

import com.witalis.design.patterns.pattern.structural.data.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker facade class
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class PrivateClassDataInvoker {

    public void invoke() {
        log.info("\tPrivate Class Data: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // devices

            Computer laptop = new Laptop(
                "Super laptop",
                "Server station",
                50_000.9999,
                100,
                true
            );
            laptop.statistics();

            log.info("");

            Computer tablet = new Tablet(
                "Power tablet",
                "Gaming tablet",
                8_800.0,
                200,
                false
            );
            tablet.statistics();

            log.info("");

            Computer mobile = new Mobile(
                "Cheap mobile",
                "Secure phone",
                350D,
                300,
                true
            );
            mobile.statistics();

            log.info("");

        } catch (Exception e) {
            log.error("\tPrivate Class Data: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tPrivate Class Data: end, time = {} ms", (end - begin) / 1000);
    }
}
