package com.witalis.design.patterns.pattern.behavioral.observer.content;

import com.witalis.design.patterns.pattern.behavioral.observer.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.observer.content.observer.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker observer pattern
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
public class ObserverInvoker {

    public void invoke() {
        log.info("\tObserver: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            log.info("\t============= Observers:");

            // laptop
            Computer laptop = new Laptop("Super Laptop", "B598XJC439", 100);
            log.info("\t# Laptop: {}", laptop);
            // tablet
            Computer tablet = new Tablet("Power tablet", "U45DY3JS58", 100);
            log.info("\t# Tablet: {}", tablet);
            // mobile
            Computer mobile = new Mobile("Cheap mobile", "Z1VJL021XY", 100);
            log.info("\t# Mobile: {}", mobile);

            log.info("");

            log.info("\t============= Observable:");

            // software
            Software operationSystem = new Software("Ubuntu 20.04 LTS");
            log.info("\t# Operation system: {}", operationSystem);
            operationSystem.registerObserver(laptop);
            operationSystem.registerObserver(tablet);
            operationSystem.registerObserver(mobile);

            log.info("");

            log.info("\t============= Observations:");

            log.info("");

            log.info("\t------------- Scenario[0]:");
            operationSystem.display();

            log.info("\t------------- Scenario[1]:");
            operationSystem.upgrade("VG8DH40SN2", 101);
            operationSystem.display();

            log.info("\t------------- Scenario[2]:");
            operationSystem.unregisterObserver(mobile);
            operationSystem.upgrade("298SGH2A3Z", 102);
            operationSystem.display();

            log.info("\t------------- Scenario[3]:");
            operationSystem.unregisterObserver(tablet);
            operationSystem.upgrade("ZWS26ND25C", 103);
            operationSystem.display();

            operationSystem.unregisterObserver(laptop);

            log.info("");

        } catch (Exception e) {
            log.error("\tObserver: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tObserver: end, time = {} ms", (end - begin) / 1000);
    }
}
