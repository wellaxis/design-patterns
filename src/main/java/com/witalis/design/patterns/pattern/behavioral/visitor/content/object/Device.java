package com.witalis.design.patterns.pattern.behavioral.visitor.content.object;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.DeviceVisitor;

/**
 * Desc: Device interface
 * User: Wellaxis
 * Date: 27.12.2021
 */
public interface Device {
    void use();
    void accept(DeviceVisitor visitor);
}
