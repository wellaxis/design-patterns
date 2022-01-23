package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.Device;

import java.util.List;

/**
 * Desc: Conjunction specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class ConjunctionSpecification extends CompositeSpecification {
    private final List<Specifiable> specifications;

    public ConjunctionSpecification(List<Specifiable> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean specify(Device device) {
        return specifications.stream()
            .allMatch(specifiable -> specifiable.specify(device));
    }
}
