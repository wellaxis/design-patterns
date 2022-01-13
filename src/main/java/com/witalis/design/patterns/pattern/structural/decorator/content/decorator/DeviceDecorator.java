package com.witalis.design.patterns.pattern.structural.decorator.content.decorator;

import com.witalis.design.patterns.pattern.structural.decorator.content.object.Device;

/**
 * Desc: Device decorator class
 * User: Wellaxis
 * Date: 13.01.2022
 */
public abstract class DeviceDecorator implements Device, Performable {
    private Device device;

    protected DeviceDecorator(Device device) {
        this.device = device;
    }

    @Override
    public void use() {
        prepare();
        device.use();
        complete();
    }

    @Override
    public void prepare() {
    }

    @Override
    public void complete() {
    }
}
