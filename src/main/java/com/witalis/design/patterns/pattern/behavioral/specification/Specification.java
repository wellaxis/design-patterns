package com.witalis.design.patterns.pattern.behavioral.specification;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.specification.content.SpecificationInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Specification pattern
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Pattern(
    name = "Specification",
    type = Classification.BEHAVIORAL,
    isClassical = false
)
public class Specification implements IPattern {

    /**
     * Definition:
     * -----------
     * Specification -> business rules can be recombined by chaining the business rules
     *     together using boolean logic. A specification pattern outlines
     *     a business rule that is combinable with other business rules.
     *     The pattern is frequently used in the context of domain-driven design.
     *
     *     As a consequence of performing runtime composition of high-level business/domain
     *     logic, the Specification pattern is a convenient tool for converting ad-hoc user
     *     search criteria into low level logic to be processed by repositories.
     *
     *     Since a specification is an encapsulation of logic in a reusable form
     *     it is very simple to thoroughly unit test, and when used
     *     in this context is also an implementation of the humble object pattern.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for set of entities.
     * 2. To create implementation classes based on common interface.
     * 3. To create a specification interface for using boolean logic.
     * 4. To create implementation classes based on specification interface.
     * 5. To add composite methods to aggregate specification class.
     * 6. To implement specification methods as business rules using boolean logic.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); etc. }
     * 2. Entity classes -> Computer [Laptop, Mobile, Tablet], { void use(); etc. }
     * 3. Specification interface -> Specifiable { boolean specify(Device device); }
     * 4. Specification classes -> CompositeSpecification [Type, Size, LessCore, LowerPrice, etc.]
     * 5. Composite methods -> CompositeSpecification { and(), or(), not() }
     * 6. Specification methods -> SizeSpecification { @Override boolean specify(Device device); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[specification]: process =============");
        var specification = new SpecificationInvoker();
        specification.invoke();
        log.info("=================================================================");
    }
}
