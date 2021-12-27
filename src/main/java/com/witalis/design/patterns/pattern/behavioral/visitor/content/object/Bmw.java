package com.witalis.design.patterns.pattern.behavioral.visitor.content.object;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.CarVisitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Bmw car
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class Bmw implements Car {

    @Override
    public void drive() {
        log.info("{} drive...", getClass().getSimpleName());
    }

    @Override
    public void accept(CarVisitor visitor) {
        visitor.accept(this);
    }
}
