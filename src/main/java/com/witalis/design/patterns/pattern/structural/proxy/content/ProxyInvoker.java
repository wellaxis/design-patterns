package com.witalis.design.patterns.pattern.structural.proxy.content;

import com.witalis.design.patterns.pattern.structural.proxy.content.object.*;
import com.witalis.design.patterns.pattern.structural.proxy.content.proxy.*;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Invoker proxy class
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
public class ProxyInvoker {

    public void invoke() {
        log.info("\tProxy: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // public
            Device client = new Computer(
                UUID.randomUUID(),
                "Public computer",
                "It is client"
            );
            scenario(client);

            log.info("");

            // secure
            Device server = new SecureComputer(
                client,
                "$ecr@t"
            );
            scenario(server);

            log.info("");

        } catch (Exception e) {
            log.error("\tProxy: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tProxy: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Device device) {
        log.info("\tComputer: {}", device.toString());
        device.turnOn();
        device.use();
        device.turnOff();
    }
}
