package com.witalis.design.patterns.pattern.creational.injection.content;

import com.witalis.design.patterns.pattern.creational.injection.content.injection.*;
import com.witalis.design.patterns.pattern.creational.injection.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker dependency injection pattern
 * User: Wellaxis
 * Date: 24.02.2022
 */
@Slf4j
public class DependencyInjectionInvoker {

    public void invoke() {
        log.info("\tDependency Injection: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // devices

            // mobile
            Software macOS = new MacOS("macOS 12", "");
            Computer mobile = new Mobile("Apple iPhone", macOS);
            scenario(mobile);

            log.info("");

            // tablet
            Software ubuOS = new UbuntuOS("Ubuntu 20.04 LTS", "");
            Computer tablet = new Tablet("Power tablet", ubuOS);
            scenario(tablet);

            log.info("");

            // laptop
            Software winOS = new WindowsOS("Windows 11", "D4N2K-1ST85-DTA25-257S6-ST15Z");
            Computer laptop = new Laptop("Super laptop", winOS);
            scenario(laptop);

            log.info("");

            // notebook
            Software winNT = new WindowsOS("Windows NT", null);
            Computer notebook = new Laptop("Server station", winNT);
            scenario(notebook);

            log.info("");

        } catch (Exception e) {
            log.error("\tDependency Injection: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tDependency Injection: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device) {
        if (device == null) return;

        log.info("\t=========== Scenario:");
        log.info("\t----------- {}", device);
        log.info("\t----------- {}", device.getSoftware());

        log.info("");
        device.use();

        log.info("\t=========== Done.");
    }
}
