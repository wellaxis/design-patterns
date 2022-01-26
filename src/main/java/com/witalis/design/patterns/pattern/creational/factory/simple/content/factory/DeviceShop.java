package com.witalis.design.patterns.pattern.creational.factory.simple.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.*;

/**
 * Desc: Device shop interface
 * User: Wellaxis
 * Date: 28.12.2021
 */
public interface DeviceShop {
    Device order(DeviceType type);
}
