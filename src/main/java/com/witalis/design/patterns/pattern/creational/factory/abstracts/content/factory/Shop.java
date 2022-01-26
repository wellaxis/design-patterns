package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.device.*;

/**
 * Desc: Shop interface
 * User: Wellaxis
 * Date: 31.12.2021
 */
public interface Shop {
    Device orderDevice(DeviceType type);
    Coffee orderCoffee(CoffeeType type);
}
