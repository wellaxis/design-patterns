package com.witalis.design.patterns.pattern.structural.adapter.content.object;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name, String comments) {
        super(UUID.randomUUID(), name, comments);
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }

    @Override
    public double getSpeed() {
        return 1.80;
    }
}
