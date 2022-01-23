package com.witalis.design.patterns.pattern.behavioral.nulls.content;

import com.witalis.design.patterns.pattern.behavioral.nulls.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.nulls.content.nulls.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Desc: Invoker null object pattern
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
public class NullObjectInvoker {

    public void invoke() {
        log.info("\tNull Object: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // device types
            List<String> types = List.of("pc", "laptop", "tablet", "notebook", "mobile");

            // devices
            List<Device> devices = DeviceUtils.formalize(types);

            // device order
            DeviceOrder order = new DeviceOrder();

            // scenario
            log.info("\t# Before: {}", order);
            order.order(devices);
            log.info("\t# After: {}", order);

            log.info("");

        } catch (Exception e) {
            log.error("\tNull Object: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tNull Object: end, time = {} ms", (end - begin) / 1000);
    }
}
