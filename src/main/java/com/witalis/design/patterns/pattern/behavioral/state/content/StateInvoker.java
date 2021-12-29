package com.witalis.design.patterns.pattern.behavioral.state.content;

import com.witalis.design.patterns.pattern.behavioral.state.content.object.*;

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

            // laptop
            Computer miBook = new Laptop("Xiaomi Mi Notebook Pro 14'");
            miBook.charge();
            miBook.turnOn();
            miBook.use();
            miBook.turnOff();

            log.info("");

            // tablet
            Computer miPad = new Tablet("Xiaomi Mi Pad 5 Wi-Fi");
            miPad.charge();
            miPad.turnOn();
            miPad.use();
            miPad.changeCharge();
            miPad.charge();
            miPad.use();
            miPad.turnOff();

            log.info("");

            // mobile
            Computer miPhone = new Mobile("Xiaomi 11T Pro");
            miPhone.charge();
            miPhone.turnOn();
            miPhone.changeCharge();
            miPhone.charge();
            miPhone.use();
            miPhone.changeCharge();
            miPhone.charge();
            miPhone.use();
            miPhone.turnOff();

            log.info("");

        } catch (Exception e) {
            log.error("\tState: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tState: end, time = {} ms", (end - begin) / 1000);
    }
}
