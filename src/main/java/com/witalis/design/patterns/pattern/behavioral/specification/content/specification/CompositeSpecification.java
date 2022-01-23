package com.witalis.design.patterns.pattern.behavioral.specification.content.specification;

import com.witalis.design.patterns.pattern.behavioral.specification.content.object.Device;

import java.util.List;

/**
 * Desc: Composite specification
 * User: Wellaxis
 * Date: 23.01.2022
 */
public abstract class CompositeSpecification implements Specifiable {

    @Override
    public abstract boolean specify(Device device);

    public CompositeSpecification and(CompositeSpecification specification) {
        return new ConjunctionSpecification(List.of(this, specification));
    }

    public CompositeSpecification or(CompositeSpecification specification) {
        return new DisjunctionSpecification(List.of(this, specification));
    }

    public CompositeSpecification not(CompositeSpecification specification) {
        return new NegationSpecification(List.of(this, specification));
    }
}
