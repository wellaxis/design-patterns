package com.witalis.design.patterns.pattern.creational.injection.content.object;

import com.witalis.design.patterns.pattern.creational.injection.content.injection.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name, Software software) {
        super(name, software);
    }

    @Override
    public void using() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
