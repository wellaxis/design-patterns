package com.witalis.design.patterns.pattern.creational.lazy.content;

import com.witalis.design.patterns.pattern.creational.lazy.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker lazy initialization pattern
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
public class LazyInitializationInvoker {

    public void invoke() {
        log.info("\tLazy Initialization: begin");
        long begin = System.nanoTime();
        try {
            Device device;

            log.info("");
            Computer.showDevices();
            log.info("");

            // laptop
            device = Computer.getDeviceByType(DeviceType.LAPTOP);
            Laptop laptop = (Laptop) device;
            laptop.setName("Lazy laptop");
            laptop.setActive(true);
            laptop.setPrice(30_000D);
            laptop.setCpu(16);
            scenario(DeviceType.LAPTOP, laptop);

            log.info("");
            Computer.showDevices();
            log.info("");

            // tablet
            device = Computer.getDeviceByType(DeviceType.TABLET);
            Tablet tablet = (Tablet) device;
            tablet.setName("Lazy tablet");
            tablet.setActive(false);
            tablet.setPrice(20_000D);
            tablet.setDiagonal(7.3);
            scenario(DeviceType.TABLET, tablet);

            log.info("");
            Computer.showDevices();
            log.info("");

            // mobile
            device = Computer.getDeviceByType(DeviceType.MOBILE);
            Mobile mobile = (Mobile) device;
            mobile.setName("Lazy mobile");
            mobile.setActive(true);
            mobile.setPrice(10_000D);
            mobile.setDualSim(true);
            scenario(DeviceType.MOBILE, mobile);

            log.info("");
            Computer.showDevices();
            log.info("");

        } catch (Exception e) {
            log.error("\tLazy Initialization: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tLazy Initialization: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(DeviceType type, Device device) {
        log.info("\t> {}[lazy] -> {}", type, device);

        Device cacheable = Computer.getDeviceByType(type);
        log.info(
            "\t> {}[hash] -> {} vs {}",
            type,
            device.hashCode(),
            cacheable.hashCode()
        );
        log.info(
            "\t> {}[equals] -> {}",
            type,
            device.equals(cacheable)
        );
    }
}
