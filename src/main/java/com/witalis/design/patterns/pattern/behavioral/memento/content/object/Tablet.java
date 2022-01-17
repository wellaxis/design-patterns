package com.witalis.design.patterns.pattern.behavioral.memento.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name, String comments, double price, int version) {
        super(name, comments, price, version);
    }

    @Override
    public DeviceType getType() {
        return DeviceType.TABLET;
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
