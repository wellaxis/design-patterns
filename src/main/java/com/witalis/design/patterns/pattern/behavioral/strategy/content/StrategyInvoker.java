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

            // laptop
            Computer macBook = new Laptop("Apple MacBook Pro 13'");
            macBook.charge();
            macBook.turnOn();
            macBook.use();
            macBook.turnOff();

            log.info("");

            // tablet
            Computer iPad = new Tablet("Apple iPad 10.2");
            iPad.charge();
            iPad.turnOn();
            iPad.use();
            iPad.setChargingStrategy(new WirelessCharging());
            iPad.charge();
            iPad.use();
            iPad.turnOff();

            log.info("");

            // mobile
            Computer iPhone = new Mobile("Apple iPhone 13 Pro");
            iPhone.charge();
            iPhone.turnOn();
            iPhone.setChargingStrategy(new USBCharging());
            iPhone.charge();
            iPhone.use();
            iPhone.setChargingStrategy(new PowerUnitCharging());
            iPhone.charge();
            iPhone.use();
            iPhone.turnOff();

            log.info("");

        } catch (Exception e) {
            log.error("\tStrategy: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tStrategy: end, time = {} ms", (end - begin) / 1000);
    }
}
