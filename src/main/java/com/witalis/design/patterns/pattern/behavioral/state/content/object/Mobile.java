package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.WirelessCharging;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name, new WirelessCharging());
    }

    @Override
    public void use() {
        log.info("Call to your friends...");
        log.info("Check youtube videos...");
    }
}
