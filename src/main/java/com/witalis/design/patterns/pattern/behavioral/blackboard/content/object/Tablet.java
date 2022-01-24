package com.witalis.design.patterns.pattern.behavioral.blackboard.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name, DeviceType.TABLET);
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
