package com.witalis.design.patterns.pattern.behavioral.servant.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name);
    }

    @Override
    public void charge() {
        log.info("\t> Wireless device charging...");
    }

    @Override
    public void check() {
        log.info("\t> Check the wifi connection...");
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Select youtube videos...");
    }

    @Override
    public void clean() {
        log.info("\t> Blow on the phone...");
    }
}
