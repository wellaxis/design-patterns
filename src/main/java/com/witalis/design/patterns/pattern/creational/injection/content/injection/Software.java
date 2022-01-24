package com.witalis.design.patterns.pattern.creational.injection.content.injection;

import com.witalis.design.patterns.pattern.creational.injection.content.object.Device;

/**
 * Desc: Software interface
 * User: Wellaxis
 * Date: 24.01.2022
 */
public interface Software {
    String getName();
    boolean usedBy(Device device);
}
