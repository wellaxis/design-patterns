package com.witalis.design.patterns.pattern.behavioral.memento.content;

import com.witalis.design.patterns.pattern.behavioral.memento.content.memento.*;
import com.witalis.design.patterns.pattern.behavioral.memento.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker memento pattern
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
public class MementoInvoker {

    public void invoke() {
        log.info("\tMemento: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // caretaker
            DeviceCaretaker caretaker = new DeviceCaretaker();

            // laptop
            Computer laptop = new Laptop("Super Laptop", "L1/2", 3456.78, 100);
            scenario(caretaker, laptop);

            log.info("");

            // tablet
            Computer tablet = new Tablet("Power tablet", "U-45", 999.99, 1000);
            scenario(caretaker, tablet);

            log.info("");

            // mobile
            Computer mobile = new Mobile("Cheap mobile", "Z*111", 100D, 10);
            scenario(caretaker, mobile);

            log.info("");

        } catch (Exception e) {
            log.error("\tMemento: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tMemento: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(DeviceCaretaker caretaker, Computer device) {
        // state before
        log.info("\t# Before modification: {}", device);
        device.use();
        // save state
        caretaker.setMemento(device.save());
        // do modification
        device.setPrice(device.getPrice() * 1.5);
        device.setActive(!device.isActive());
        device.setComments("Device modification");
        device.setVersion(device.getVersion() + 1);
        // state after
        log.info("\t# Do modification: {}", device);
        // undo state
        device.load(caretaker.getMemento(device.getType()));
        // state original
        log.info("\t# Undo modification: {}", device);
    }
}
