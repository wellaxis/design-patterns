package com.witalis.design.patterns.pattern.behavioral.visitor.content.object;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.CarVisitor;

/**
 * Desc: Car interface
 * User: Wellaxis
 * Date: 27.12.2021
 */
public interface Car {
    void drive();
    void accept(CarVisitor visitor);
}
