package com.witalis.design.patterns.pattern.behavioral.command.content.object;

/**
 * Desc: Device interface
 * User: Wellaxis
 * Date: 23.01.2022
 */
public interface Device {
    void use();
    void turnOn();
    void turnOff();
    void installDriver(String driver);
}
