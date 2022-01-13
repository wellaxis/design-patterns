package com.witalis.design.patterns.pattern.structural.decorator.content.decorator;

import com.witalis.design.patterns.pattern.structural.decorator.content.object.Device;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Device cleaner decorator
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class DeviceCleanerDecorator extends DeviceDecorator {

    public DeviceCleanerDecorator(Device device) {
        super(device);
    }

    @Override
    public void prepare() {
        log.info("\t# Wipe the screen with a wet cloth...");
    }

    @Override
    public void complete() {
        log.info("\t# Wash the cloth and hang it to dry...");
    }
}
