package com.witalis.design.patterns.pattern.behavioral.blackboard.content.object;

/**
 * Desc: Device interface
 * User: Wellaxis
 * Date: 24.01.2022
 */
public interface Device {
    String getName();
    DeviceType getType();
    void check();
    void use();
}
