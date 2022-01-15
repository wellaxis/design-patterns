package com.witalis.design.patterns.pattern.structural.twin.content.object1;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device {
    private String name;

    protected Computer(String name) {
        this.name = name;
    }

    public void charge() {
        log.info("\t> Computer is charging, please wait...");
    }

    @Override
    public String toString() {
        return "Computer [" + getClass().getSimpleName().toLowerCase() + ": " + name + "]";
    }
}
