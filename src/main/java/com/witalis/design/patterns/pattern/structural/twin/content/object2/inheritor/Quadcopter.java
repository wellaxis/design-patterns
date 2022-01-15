package com.witalis.design.patterns.pattern.structural.twin.content.object2.inheritor;

import com.witalis.design.patterns.pattern.structural.twin.content.object2.Copter;

/**
 * Desc: Quadcopter
 * User: Wellaxis
 * Date: 15.01.2022
 */
public class Quadcopter extends Copter {

    public Quadcopter(String name) {
        super(name);
    }

    @Override
    public void refuel() {
        if (getTwin() != null) getTwin().charge();
    }
}
