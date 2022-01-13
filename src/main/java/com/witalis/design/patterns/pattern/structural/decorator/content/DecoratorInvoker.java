package com.witalis.design.patterns.pattern.structural.decorator.content;

import com.witalis.design.patterns.pattern.structural.decorator.content.decorator.*;
import com.witalis.design.patterns.pattern.structural.decorator.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker decorator class
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class DecoratorInvoker {

    public void invoke() {
        log.info("\tDecorator: begin");
        long begin = System.nanoTime();
        try {
            String description;

            log.info("");

            // laptop
            description = "Lenovo Yoga 7 27ACH6";
            Device laptop = new Laptop("Lenovo-Yoga", description);
            log.info("\t$ Device[laptop]: {}", description);
            laptop.use();
            log.info("");

            // table
            description = "Lenovo Tab M10";
            Device tablet = new Tablet("Lenovo-Tab", description);
            log.info("\t$ Device[tablet]: {}", description);
            tablet.use();
            log.info("");

            // mobile
            description = "Lenovo Vibe K5 Note Pro";
            Device mobile = new Mobile("Lenovo-Vibe", description);
            log.info("\t$ Device[mobile]: {}", description);
            mobile.use();
            log.info("");

            // decorated laptop
            description = "Clean, switch & install drivers to laptop";
            log.info("\t$ Device[scenario #1]: {}", description);
            Device decoratedLaptop = new DeviceCleanerDecorator(new DeviceSwitchDecorator(new DeviceDriverDecorator(laptop)));
            decoratedLaptop.use();
            log.info("");

            // decorated table
            description = "Turn on & turn off tablet";
            log.info("\t$ Device[scenario #2]: {}", description);
            Device decoratedTablet = new DeviceSwitchDecorator(tablet);
            decoratedTablet.use();
            log.info("");

            // decorated mobile
            description = "Clean and install drivers to phone";
            log.info("\t$ Device[scenario #3]: {}", description);
            Device decoratedMobile = new DeviceCleanerDecorator(new DeviceDriverDecorator(mobile));
            decoratedMobile.use();
            log.info("");

        } catch (Exception e) {
            log.error("\tDecorator: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tDecorator: end, time = {} ms", (end - begin) / 1000);
    }
}
