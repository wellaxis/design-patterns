package com.witalis.design.patterns.pattern.structural.data.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Getter
public class Laptop extends Computer {

    public Laptop(String name, String comments, double price, int version, boolean active) {
        super(name, comments, price, version, active);
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
