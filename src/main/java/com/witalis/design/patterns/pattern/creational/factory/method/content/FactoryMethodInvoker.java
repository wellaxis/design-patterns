package com.witalis.design.patterns.pattern.creational.factory.method.content;

import com.witalis.design.patterns.pattern.creational.factory.method.content.factory.*;
import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker factory method pattern
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class FactoryMethodInvoker {

    public void invoke() {
        log.info("\tFactory Method: begin");
        long begin = System.nanoTime();
        try {
            // shop
            DeviceShop shop;

            // device
            Device device;

            log.info("");

            // the 1st order
            shop = new BusinessShop();
            device = shop.order(DeviceType.LAPTOP);
            scenario(device, "1st");

            log.info("");

            // the 2nd order
            shop = new EverydayShop();
            device = shop.order(DeviceType.TABLET);
            scenario(device, "2nd");

            log.info("");

            // the 3rd order
            shop = new PrestigeShop();
            device = shop.order(DeviceType.MOBILE);
            scenario(device, "3rd");

            log.info("");

        } catch (Exception e) {
            log.error("\tFactory Method: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tFactory Method: end, time = {} ms", (end - begin) / 1000);
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
