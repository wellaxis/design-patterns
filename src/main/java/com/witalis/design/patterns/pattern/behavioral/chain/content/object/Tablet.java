package com.witalis.design.patterns.pattern.behavioral.chain.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Tablet extends Computer {

    public Tablet(String name, int version) {
        super(name, version);
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
