package com.witalis.design.patterns.pattern.behavioral.servant.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name);
    }

    @Override
    public void charge() {
        log.info("\t> Universal Serial Bus charging...");
    }

    @Override
    public void check() {
        log.info("\t> Check system with anti-virus software...");
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }

    @Override
    public void clean() {
        log.info("\t> Wipe with a damp cloth...");
    }
}
