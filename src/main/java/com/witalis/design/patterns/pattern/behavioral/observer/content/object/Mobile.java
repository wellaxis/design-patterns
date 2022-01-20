package com.witalis.design.patterns.pattern.behavioral.observer.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 20.01.2022
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name, String token, int version) {
        super(name, token, version);
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
