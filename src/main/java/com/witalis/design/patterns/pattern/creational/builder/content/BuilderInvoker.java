package com.witalis.design.patterns.pattern.creational.builder.content;

import com.witalis.design.patterns.pattern.creational.builder.content.object.*;

import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Desc: Invoker builder pattern
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
public class BuilderInvoker {

    public void invoke() {
        log.info("\tBuilder: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // expensive
            var zBook = Computer.builder()
                .setId(UUID.randomUUID())
                .setName("HP ZBook Fury 17'")
                .setPrice(180_000.0)
                .setActive(true)
                .setActivation(LocalDateTime.now())
                .setComments("ZBook as max price.")
                .build();
            scenario(zBook);

            log.info("");

            // cheap
            var lifeBook = Computer.builder()
                .setId(UUID.randomUUID())
                .setName("Fujitsu LIFEBOOK E736")
                .setComments("Decommissioned equipment")
                .build();
            scenario(lifeBook);

            log.info("");

        } catch (Exception e) {
            log.error("\tBuilder: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tBuilder: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Device device) {
        log.info("\tComputer: {}", device.toString());
        device.use();
    }
}
