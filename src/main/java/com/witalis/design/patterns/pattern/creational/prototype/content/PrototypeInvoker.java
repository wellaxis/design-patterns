package com.witalis.design.patterns.pattern.creational.prototype.content;

import com.witalis.design.patterns.pattern.creational.prototype.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker prototype pattern
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
public class PrototypeInvoker {

    public void invoke() {
        log.info("\tPrototype: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // laptop
            Laptop laptop = new Laptop("Lenovo laptop", 45_000D, true);
            laptop.setCpu(8);
            scenario(laptop);

            log.info("");

            // tablet
            Tablet tablet = new Tablet("Lenovo tablet", 25_000D, false);
            tablet.setDiagonal(10.1);
            scenario(tablet);

            log.info("");

            // mobile
            Mobile mobile = new Mobile("Lenovo mobile", 15_000D, true);
            mobile.setDualSim(true);
            scenario(mobile);

            log.info("");

        } catch (Exception e) {
            log.error("\tPrototype: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tPrototype: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Device device) throws CloneNotSupportedException {
        var computer = (Computer) device;
        var type = device.getClass().getSimpleName();

        log.info("\t> {}[original]: {}", type, device);
        log.info("\t> {}[cloned]: {}", type, computer.clone());
        log.info("\t> {}[propagated]: {}", type, computer.propagate());
    }
}
