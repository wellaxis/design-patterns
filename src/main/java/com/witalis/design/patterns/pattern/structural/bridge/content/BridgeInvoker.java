package com.witalis.design.patterns.pattern.structural.bridge.content;

import com.witalis.design.patterns.pattern.structural.bridge.content.bridge.*;
import com.witalis.design.patterns.pattern.structural.bridge.content.object.*;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Desc: Invoker bridge class
 * User: Wellaxis
 * Date: 09.12.2021
 */
@Slf4j
public class BridgeInvoker {

    public void invoke() {
        log.info("\tBridge: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            log.info("\t! Presentation:");

            // advertisement
            var advertisers = List.of(
                new InternetAdvertiser(new Laptop("HP Envy Laptop 13'")),
                new TelevisionAdvertiser(new Tablet("HP Stream Tablet 7'")),
                new RadioAdvertiser(new Mobile("HP Elite Phone 5.96'")),
                new RadioAdvertiser(new Laptop("HP ZBook Fury Laptop 17'"))
            );

            for (Advertiser advertiser: advertisers) {
                log.info("");
                advertiser.promote();
            }

            log.info("");

        } catch (Exception e) {
            log.error("\tBridge: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tBridge: end, time = {} ms", (end - begin) / 1000);
    }
}
