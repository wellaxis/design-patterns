package com.witalis.design.patterns.pattern.behavioral.mediator.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 21.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Tablet extends Computer {

    public Tablet(String name, String comments, int version) {
        super(name, comments, version);
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
