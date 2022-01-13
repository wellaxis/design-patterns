package com.witalis.design.patterns.pattern.structural.decorator.content.decorator;

import com.witalis.design.patterns.pattern.structural.decorator.content.object.Device;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Device driver decorator
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class DeviceDriverDecorator extends DeviceDecorator {

    public DeviceDriverDecorator(Device device) {
        super(device);
    }

    @Override
    public void prepare() {
        log.info("\t# Install all drivers. Wait, please...");
    }
}
