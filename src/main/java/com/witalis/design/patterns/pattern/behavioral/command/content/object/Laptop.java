package com.witalis.design.patterns.pattern.behavioral.command.content.object;

import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@ToString(callSuper = true)
public class Laptop extends Computer {

    public Laptop(String name, String comments, int version) {
        super(name, comments, version);
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
