package com.witalis.design.patterns.pattern.structural.bridge.content.object;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 09.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device {
    private String name;

    protected Computer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Device [" + getClass().getSimpleName().toLowerCase() + ": " + name + "]";
    }
}
