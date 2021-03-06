package com.witalis.design.patterns.pattern.behavioral.strategy.content.object;

import com.witalis.design.patterns.pattern.behavioral.strategy.content.strategy.WirelessStrategy;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name, new WirelessStrategy());
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
