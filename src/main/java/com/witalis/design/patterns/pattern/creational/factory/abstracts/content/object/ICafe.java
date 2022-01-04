package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea.*;

/**
 * Desc: Coffee shop interface
 * User: Wellaxis
 * Date: 31.12.2021
 */
public interface ICafe {
    Coffee orderCoffee(CoffeeType type);
    Tea orderTea(TeaType type);
}
