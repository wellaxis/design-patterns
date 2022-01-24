package com.witalis.design.patterns.pattern.structural.data.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Getter
public class Mobile extends Computer {

    public Mobile(String name, String comments, double price, int version, boolean active) {
        super(name, comments, price, version, active);
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
