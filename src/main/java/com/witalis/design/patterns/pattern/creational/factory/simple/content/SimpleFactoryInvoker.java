package com.witalis.design.patterns.pattern.creational.factory.simple.content;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.factory.*;
import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker simple factory pattern
 * User: Wellaxis
 * Date: 25.01.2022
 */
@Slf4j
public class SimpleFactoryInvoker {

    public void invoke() {
        log.info("\tSimple Factory: begin");
        long begin = System.nanoTime();
        try {

            // shop
            DeviceShop shop = new ComputerShop();

            // device
            Device device;

            log.info("");

            // the 1st order
            device = shop.order(DeviceType.LAPTOP);
            scenario(device, "1st");

            log.info("");

            // the 2nd order
            device = shop.order(DeviceType.TABLET);
            scenario(device, "2nd");

            log.info("");

            // the 3rd order
            device = shop.order(DeviceType.MOBILE);
            scenario(device, "3rd");

            log.info("");

        } catch (Exception e) {
            log.error("\tSimple Factory: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tSimple Factory: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Device device, String information) {
        log.info(
            "\t*** The {} device: {}",
            information,
            device.getClass().getSimpleName().toLowerCase()
        );
        log.info("\t=== Information: {}", device);
    }
}
