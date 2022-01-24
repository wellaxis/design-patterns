package com.witalis.design.patterns.pattern.creational.injection.content.object;

import com.witalis.design.patterns.pattern.creational.injection.content.injection.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name, Software software) {
        super(name, software);
    }

    @Override
    public void using() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
