package com.witalis.design.patterns.pattern.behavioral.template.content;

import com.witalis.design.patterns.pattern.behavioral.template.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker template method pattern
 * User: Wellaxis
 * Date: 19.01.2022
 */
@Slf4j
public class TemplateMethodInvoker {

    public void invoke() {
        log.info("\tTemplate Method: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // laptop
            Computer laptop = new Laptop("Super Laptop", "L1/2");
            scenario(laptop);

            log.info("");

            // tablet
            Computer tablet = new Tablet("Power tablet", "U-45");
            scenario(tablet);

            log.info("");

            // mobile
            Computer mobile = new Mobile("Cheap mobile", "Z*111");
            scenario(mobile);

            log.info("");

        } catch (Exception e) {
            log.error("\tTemplate Method: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tTemplate Method: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Device device) {
        // device representation
        log.info("\t$ Device -> {}", device);
        // invoke template method
        device.use();
    }
}
