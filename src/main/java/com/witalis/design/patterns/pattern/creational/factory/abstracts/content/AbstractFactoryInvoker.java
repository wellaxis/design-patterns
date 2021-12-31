package com.witalis.design.patterns.pattern.creational.factory.abstracts.content;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker abstract factory pattern
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public class AbstractFactoryInvoker {

    public void invoke() {
        log.info("\tAbstract Factory: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

        } catch (Exception e) {
            log.error("\tAbstract Factory: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tAbstract Factory: end, time = {} ms", (end - begin) / 1000);
    }
}
