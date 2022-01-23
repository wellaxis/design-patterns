package com.witalis.design.patterns.pattern.behavioral.specification.content.object;

/**
 * Desc: Device interface
 * User: Wellaxis
 * Date: 23.01.2022
 */
public interface Device {
    void use();
    String getName();
    DeviceType getType();
    DeviceSize getSize();
    DevicePrice getPrice();
    DeviceCpu getCpu();
}
