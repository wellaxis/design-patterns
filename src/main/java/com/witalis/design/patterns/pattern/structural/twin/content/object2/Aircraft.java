package com.witalis.design.patterns.pattern.structural.twin.content.object2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Aircraft device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Aircraft implements Flyable {
    private String name;

    protected Aircraft(String name) {
        this.name = name;
    }

    public void refuel() {
        log.info("\t# Aircraft is refueling, please wait...");
    }

    @Override
    public String toString() {
        return "Aircraft [" + getClass().getSimpleName().toLowerCase() + ": " + name + "]";
    }
}
