package com.witalis.design.patterns.pattern.behavioral.servant.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name);
    }

    @Override
    public void charge() {
        log.info("\t> Power unit charging...");
    }

    @Override
    public void check() {
        log.info("\t> Check all e-mails...");
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Define computer settings...");
    }

    @Override
    public void clean() {
        log.info("\t> Vacuum the laptop's keyboard...");
    }
}
