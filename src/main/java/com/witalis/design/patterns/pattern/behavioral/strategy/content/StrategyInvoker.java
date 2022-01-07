package com.witalis.design.patterns.pattern.behavioral.strategy.content;

import com.witalis.design.patterns.pattern.behavioral.strategy.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker strategy pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class StrategyInvoker {

    public void invoke() {
        log.info("\tStrategy: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // laptop
            Computer macBook = new Laptop("Apple MacBook Pro 13'");
            log.info(macBook.toString());
            scenario(macBook);

            log.info("");

            // tablet
            Computer iPad = new Tablet("Apple iPad 10.2");
            log.info(iPad.toString());
            scenario(iPad);

            log.info("");

            // mobile
            Computer iPhone = new Mobile("Apple iPhone 13 Pro");
            log.info(iPhone.toString());
            scenario(iPhone);

            log.info("");

        } catch (Exception e) {
            log.error("\tStrategy: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tStrategy: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device) {
        // on
        device.turnOn();
        // default
        device.charge();
        device.use();
        // wireless
        device.setChargingStrategy(new WirelessStrategy());
        device.charge();
        device.use();
        // usb
        device.setChargingStrategy(new USBStrategy());
        device.charge();
        device.use();
        // repaired
        device.setChargingStrategy(new PowerUnitStrategy());
        device.charge();
        device.use();
        // off
        device.turnOff();
    }
}
