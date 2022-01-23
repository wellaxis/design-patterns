package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.*;

/**
 * Desc: More cores specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class MoreCoresSpecification extends CompositeSpecification {
    private final DeviceCpu cpu;

    public MoreCoresSpecification(DeviceCpu cpu) {
        this.cpu = cpu;
    }

    @Override
    public boolean specify(Device device) {
        if (device == null || cpu == null) return false;
        return device.getCpu().getCores() >= cpu.getCores();
    }
}
