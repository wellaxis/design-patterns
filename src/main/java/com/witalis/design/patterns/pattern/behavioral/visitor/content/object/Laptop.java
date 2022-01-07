package com.witalis.design.patterns.pattern.behavioral.visitor.content.object;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.DeviceVisitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name);
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }

    @Override
    public void accept(DeviceVisitor visitor) {
        visitor.visit(this);
    }
}
