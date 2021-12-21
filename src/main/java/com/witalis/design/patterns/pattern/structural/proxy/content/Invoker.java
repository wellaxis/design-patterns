package com.witalis.design.patterns.pattern.structural.proxy.content;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker class
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
public class Invoker implements Invocable {

    @Override
    public void invoke() {
        log.info("\tInvoker: handle...");
    }
}
