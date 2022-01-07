package com.witalis.design.patterns.pattern.structural.adapter.content.object;

import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name, String comments) {
        super(UUID.randomUUID(), name, comments);
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }

    @Override
    public double getSpeed() {
        return 2.20;
    }
}
