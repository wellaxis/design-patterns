package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.Device;

import java.util.List;

/**
 * Desc: Disjunction specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class DisjunctionSpecification extends CompositeSpecification {
    private final List<Specifiable> specifications;

    public DisjunctionSpecification(List<Specifiable> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean specify(Device device) {
        return specifications.stream()
            .anyMatch(specifiable -> specifiable.specify(device));
    }
}
