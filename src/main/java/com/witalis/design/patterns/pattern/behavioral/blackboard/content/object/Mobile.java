package com.witalis.design.patterns.pattern.behavioral.blackboard.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name, DeviceType.MOBILE);
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Select youtube videos...");
    }
}
