package com.witalis.design.patterns.pattern.creational.factory.simple.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.*;

/**
 * Desc: Device factory class
 * User: Wellaxis
 * Date: 25.01.2022
 */
public final class DeviceFactory {

    /**
     * Static method to create a required entity instance based on its type.
     * <p/>
     * @param type the type of required entity
     * @return the instance of required entity
     */
    public static Device create(DeviceType type) {
        return switch (type) {
            case LAPTOP -> new Laptop();
            case TABLET -> new Tablet();
            case MOBILE -> new Mobile();
        };
    }
}
