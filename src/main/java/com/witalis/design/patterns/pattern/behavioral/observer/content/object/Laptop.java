package com.witalis.design.patterns.pattern.behavioral.observer.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 20.01.2022
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name, String token, int version) {
        super(name, token, version);
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
