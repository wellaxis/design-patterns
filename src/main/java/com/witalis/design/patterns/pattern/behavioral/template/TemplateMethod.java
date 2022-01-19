package com.witalis.design.patterns.pattern.behavioral.template;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.template.content.TemplateMethodInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Template method pattern
 * User: Wellaxis
 * Date: 19.01.2022
 */
@Slf4j
@Pattern(
    name = "Template method",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class TemplateMethod implements IPattern {

    /**
     * Definition:
     * -----------
     * Template Method -> is a method in a superclass, usually an abstract superclass,
     *     and defines the skeleton of an operation in terms of a number
     *     of high-level steps. These steps are themselves implemented
     *     by additional helper methods in the same class as the template method.
     *
     *     The helper methods may be either abstract methods, in which case
     *     subclasses are required to provide concrete implementations,
     *     or hook methods, which have empty bodies in the superclass.
     *     Subclasses can customize the operation by overriding the hook methods.
     *
     *     The intent of the template method is to define the overall structure
     *     of the operation, while allowing subclasses to refine, or redefine, certain steps.
     *
     * Algorithm:
     * ----------
     * 1. To create common interface for set of entities.
     * 2. To create abstract entity class based on common interface.
     * 3. To create multiple entities implementations extends from abstract class.
     * 4. To add template method to abstract entity class (set it as final).
     * 5. To add abstract methods for template one to abstract class.
     * 6. To add the overridden methods to every entity implementation.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Abstract class -> Computer { void use(); }
     * 3. Entity classes -> Laptop, Tablet, Mobile, etc.
     * 4. Template method -> Computer { @Override public final void use(); }
     * 5. Abstract methods -> Computer { charge(), turnOn(), handle(), turnOff(), clean(), etc. }
     * 6. Overridden methods -> Laptop, Tablet, Mobile { charge(), -//-, etc. }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[template-method]: process ===========");
        var templateMethod = new TemplateMethodInvoker();
        templateMethod.invoke();
        log.info("=================================================================");
    }
}
