package com.witalis.design.patterns.pattern.creational.injection.content.object;

import com.witalis.design.patterns.pattern.creational.injection.content.injection.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name, Software software) {
        super(name, software);
    }

    @Override
    public void using() {
        log.info("\t> Install system drivers...");
        log.info("\t> Develop computer program...");
    }
}
