package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.Device;

import java.util.List;

/**
 * Desc: Negation specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class NegationSpecification extends CompositeSpecification {
    private final List<Specifiable> specifications;

    public NegationSpecification(List<Specifiable> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean specify(Device device) {
        return specifications.stream()
            .noneMatch(specifiable -> specifiable.specify(device));
    }
}
