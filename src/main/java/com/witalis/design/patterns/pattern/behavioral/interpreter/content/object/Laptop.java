package com.witalis.design.patterns.pattern.behavioral.interpreter.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Laptop extends Computer {

    public Laptop(String name, int version) {
        super(name, version);
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
