package com.witalis.design.patterns.pattern.creational.factory.simple.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer shop
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public class ComputerShop implements DeviceShop {

    /**
     * Simple invoke static factory method to create an entity.
     * Based on input type, we need to return a required subclass entity.
     * <p/>
     * @param type the type of required entity
     * @return the instance of required entity
     */
    public Device order(DeviceType type) {
        Device device = DeviceFactory.create(type);

        device.charge();
        device.turnOn();
        device.check();
        device.use();
        device.turnOff();
        device.clean();

        log.info("\t$ Device is ready, thanks for business!");
        return device;
    }
}
