package com.witalis.design.patterns.pattern.structural.content;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker proxy class
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
public class ProxyInvoker implements Invocable {
    private Invoker invoker;

    @Override
    public void invoke() {
        log.info("\tProxy: begin");
        long begin = System.nanoTime();
        try {
            if (invoker == null) {
                invoker = new Invoker();
            }
            invoker.invoke();
        } catch (Exception e) {
            log.error("\tProxy: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tProxy: end, time = {} ms", (end - begin) / 1000);
    }
}
