package com.witalis.design.patterns.pattern.structural.flyweight.content;

import com.witalis.design.patterns.pattern.structural.flyweight.content.flyweight.DeviceFlyweight;
import com.witalis.design.patterns.pattern.structural.flyweight.content.object.*;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: Invoker flyweight class
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class FlyweightInvoker {

    public void invoke() {
        log.info("\tFlyweight: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // factory
            DeviceFlyweight factory = new DeviceFlyweight();

            // devices
            List<Device> devices = new ArrayList<>();

            // current
            devices.add(new Laptop(10, "macBook"));
            devices.add(new Tablet(20, "iPad"));
            devices.add(new Mobile(30, "iPhone"));

            // revision: before
            for (Device device: devices) {
                device.use();
            }

            // scenario: purchase 5 laptops, 3 tablets & 4 mobiles
            final int CNT_LAPTOPS = 5;
            for (int i = 1; i <= CNT_LAPTOPS; i++) {
                devices.add(factory.getDeviceByType(DeviceType.LAPTOP, i));
            }

            final int CNT_TABLETS = 3;
            for (int i = 1; i <= CNT_TABLETS; i++) {
                devices.add(factory.getDeviceByType(DeviceType.TABLET, i));
            }

            final int CNT_MOBILES = 4;
            for (int i = 1; i <= CNT_MOBILES; i++) {
                devices.add(factory.getDeviceByType(DeviceType.MOBILE, i));
            }

            // revision: after
            for (Device device: devices) {
                device.use();
            }

            log.info("");

        } catch (Exception e) {
            log.error("\tFlyweight: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tFlyweight: end, time = {} ms", (end - begin) / 1000);
    }
}
