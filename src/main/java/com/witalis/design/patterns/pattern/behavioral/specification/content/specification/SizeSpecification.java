package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.*;

/**
 * Desc: Size specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class SizeSpecification extends CompositeSpecification {
    private final DeviceSize size;

    public SizeSpecification(DeviceSize size) {
        this.size = size;
    }

    @Override
    public boolean specify(Device device) {
        if (device == null || size == null) return false;
        return device.getSize().equals(size);
    }
}
