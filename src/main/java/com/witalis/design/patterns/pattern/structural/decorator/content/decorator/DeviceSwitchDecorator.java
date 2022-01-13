package com.witalis.design.patterns.pattern.structural.decorator.content.decorator;

import com.witalis.design.patterns.pattern.structural.decorator.content.object.Device;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Device switch decorator
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class DeviceSwitchDecorator extends DeviceDecorator {

    public DeviceSwitchDecorator(Device device) {
        super(device);
    }

    @Override
    public void prepare() {
        log.info("\t# Turning on device...");
    }

    @Override
    public void complete() {
        log.info("\t# Turning off device...");
    }
}
