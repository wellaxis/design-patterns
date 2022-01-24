package com.witalis.design.patterns.pattern.structural.data.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Getter
public class Tablet extends Computer {

    public Tablet(String name, String comments, double price, int version, boolean active) {
        super(name, comments, price, version, active);
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}
