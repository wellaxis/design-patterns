package com.witalis.design.patterns.pattern.structural.adapter.content.object;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name, String comments) {
        super(UUID.randomUUID(), name, comments);
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Define computer settings...");
    }

    @Override
    public double getSpeed() {
        return 3.40;
    }
}
