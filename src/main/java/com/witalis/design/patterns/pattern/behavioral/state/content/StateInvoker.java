package com.witalis.design.patterns.pattern.behavioral.state.content;

import com.witalis.design.patterns.pattern.behavioral.state.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.state.content.state.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker state pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class StateInvoker {

    public void invoke() {
        log.info("\tState: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // laptop
            Computer miBook = new Laptop("Xiaomi Mi Notebook Pro 14'");
            log.info(miBook.toString());
            scenario(miBook);

            log.info("");

            // tablet
            Computer miPad = new Tablet("Xiaomi Mi Pad 5 Wi-Fi");
            log.info(miPad.toString());
            scenario(miPad);

            log.info("");

            // mobile
            Computer miPhone = new Mobile("Xiaomi 11T Pro");
            log.info(miPhone.toString());
            scenario(miPhone);

            log.info("");

        } catch (Exception e) {
            log.error("\tState: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tState: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device) {
        // on
        device.turnOn();
        // new
        device.check();
        device.use();
        // broken
        device.setWorkingState(new BrokenState());
        device.check();
        device.use();
        // for repair
        device.changeState();
        device.check();
        device.use();
        // repaired
        device.setWorkingState(new RepairedState());
        device.check();
        device.use();
        // from repair
        device.changeState();
        device.check();
        device.use();
        // ready
        device.changeState();
        device.check();
        device.use();
        // off
        device.turnOff();
    }
}
