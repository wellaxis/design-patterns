package com.witalis.design.patterns.pattern.creational.injection.content.injection;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Operating system software
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class OperatingSystem implements Software {
    private String name;
    private String license;

    protected OperatingSystem(String name, String license) {
        this.name = name;
        this.license = license;
    }

    @Override
    public String toString() {
        return "Software: [" + "name='" + name + "', " + "license='" + license + "']";
    }
}
