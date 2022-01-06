package com.witalis.design.patterns.pattern.behavioral.visitor;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.VisitorInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Visitor pattern
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
@Pattern(
    name = "Visitor",
    type = Classification.BEHAVIORAL
)
public class Visitor implements IPattern {

    /**
     * Definition:
     * -----------
     * Visitor -> used to simplify operations with groups of related objects.
     *     It is a way of separating an algorithm from an object structure on which it operates.
     *     A practical result of this separation is the ability to add new operations
     *     to existing object structures without modifying the structures.
     *     It is one way to follow the open/closed principle.
     *
     * Algorithm:
     * ----------
     * 1. To create an entity interface with an accept method for a visitor.
     * 2. To create a visitor interface with multiple visit methods.
     * 3. To create multiple entity class realizations & overrides of accept methods.
     * 4. To create multiple visitor class realizations & overrides of visit methods.
     *
     * Example:
     * --------
     * 1. Entity interface -> Car { void accept(CarVisitor visitor); }.
     * 2. Visitor interface -> CarVisitor { void visit(Audi audi); etc. }.
     * 3. Entity classes -> [Audi, Bmw, Mercedes, Volkswagen], { visitor.visit(this); }
     * 4. Visitor classes -> [CruiseControl, Transmission], { void visit(Audi audi); etc. }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[visitor]: process ===================");
        var visitor = new VisitorInvoker();
        visitor.invoke();
        log.info("=================================================================");
    }
}
