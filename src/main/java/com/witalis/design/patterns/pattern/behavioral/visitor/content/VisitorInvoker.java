package com.witalis.design.patterns.pattern.behavioral.visitor.content;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.*;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Desc: Invoker visitor pattern
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class VisitorInvoker {

    public void invoke() {
        log.info("\tVisitor: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // visitor
            DeviceVisitor accessory = new AccessoryVisitor();
            DeviceVisitor software = new SoftwareVisitor();
            var visitors = List.of(accessory, software);

            log.info("");

            // laptop
            Computer laptop = new Laptop("Super laptop");
            log.info(laptop.toString());
            scenario(laptop, visitors);

            log.info("");

            // tablet
            Computer tablet = new Tablet("Power tablet");
            log.info(tablet.toString());
            scenario(tablet, visitors);

            log.info("");

            // mobile
            Computer mobile = new Mobile("Cheap mobile");
            log.info(mobile.toString());
            scenario(mobile, visitors);

            log.info("");

        } catch (Exception e) {
            log.error("\tVisitor: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tVisitor: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device, List<DeviceVisitor> visitors) {
        device.use();
        for (DeviceVisitor visitor: visitors) {
            device.accept(visitor);
        }
    }
}
