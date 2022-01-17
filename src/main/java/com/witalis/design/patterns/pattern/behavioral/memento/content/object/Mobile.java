package com.witalis.design.patterns.pattern.behavioral.memento.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name, String comments, double price, int version) {
        super(name, comments, price, version);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.MOBILE;
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
