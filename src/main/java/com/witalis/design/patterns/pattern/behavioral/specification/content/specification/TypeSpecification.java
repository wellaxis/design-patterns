package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.*;

/**
 * Desc: Type specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class TypeSpecification extends CompositeSpecification {
    private final DeviceType type;

    public TypeSpecification(DeviceType type) {
        this.type = type;
    }

    @Override
    public boolean specify(Device device) {
        if (device == null || type == null) return false;
        return device.getType() == type;
    }
}
