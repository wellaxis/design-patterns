package com.witalis.design.patterns.pattern.behavioral.nulls.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Mobile extends Computer {

    public Mobile(String name, String comments, int version) {
        super(name, comments, version);
    }

    @Override
    public void use() {
        log.info("\t> Check calls to friends...");
    }
}
