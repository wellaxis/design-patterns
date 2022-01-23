package com.witalis.design.patterns.pattern.behavioral.specification.content;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.specification.content.specification.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Desc: Invoker specification pattern
 * User: Wellaxis
 * Date: 23.02.2022
 */
@Slf4j
public class SpecificationInvoker {

    public void invoke() {
        log.info("\tSpecification: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // devices

            Computer server = new Laptop("Server station");
            Computer laptop = new Laptop("Super laptop", DeviceType.LAPTOP, DeviceSize.LARGE, new DevicePrice(30_000.0), new DeviceCpu(6));
            Computer tablet = new Tablet("Power tablet");
            Computer gaming = new Tablet("Gaming tablet", DeviceType.TABLET, DeviceSize.MIDDLE, new DevicePrice(6_000.0), new DeviceCpu(2));
            Computer secure = new Mobile("Secure mobile");
            Computer mobile = new Mobile("Cheap mobile", DeviceType.MOBILE, DeviceSize.MIDDLE, new DevicePrice(5_000.0), new DeviceCpu(8));

            List<Device> devices = List.of(
                server, laptop, tablet, gaming, secure, mobile
            );

            // scenarios
            scenario(
                devices,
                new TypeSpecification(DeviceType.LAPTOP)
            );

            log.info("");

            scenario(
                devices,
                new SizeSpecification(DeviceSize.MIDDLE)
            );

            log.info("");

            scenario(
                devices,
                new MoreCoresSpecification(new DeviceCpu(10))
            );

            log.info("");

            scenario(
                devices,
                new LessCoresSpecification(new DeviceCpu(10))
                    .and(new LowerPriceSpecification(new DevicePrice(40_000.0)))
            );

            log.info("");

            scenario(
                devices,
                new SizeSpecification(DeviceSize.SMALL)
                    .and(new TypeSpecification(DeviceType.MOBILE))
                    .or(new LowerPriceSpecification(new DevicePrice(40_000.0)))
                    .not(new LessCoresSpecification(new DeviceCpu(10)))
            );

            log.info("");

        } catch (Exception e) {
            log.error("\tSpecification: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tSpecification: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(List<Device> devices, Specifiable specification) {
        log.info("\t# Scenario: start");
        devices.stream().filter(specification::specify).forEach(
            device -> {
                log.info("\t> {}", device);
                device.use();
            }
        );
        log.info("\t# Scenario: finish");
    }
}
