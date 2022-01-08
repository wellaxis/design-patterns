package com.witalis.design.patterns.pattern.structural.bridge.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 09.01.2022
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name);
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
