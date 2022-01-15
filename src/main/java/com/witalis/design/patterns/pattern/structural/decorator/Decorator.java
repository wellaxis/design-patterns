package com.witalis.design.patterns.pattern.structural.decorator;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.decorator.content.DecoratorInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Decorator pattern
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Pattern(
    name = "Decorator",
    type = Classification.STRUCTURAL,
    isClassical = true
)
public class Decorator implements IPattern {

    /**
     * Definition:
     * -----------
     * Decorator -> is a design pattern that allows behavior to be added
     *     to an individual object, dynamically, without affecting
     *     the behavior of other objects from the same class.
     *
     *     Adds new functionality to an existing object
     *     without binding its structure.
     *
     *     The decorator pattern is often useful for adhering to the
     *     Single Responsibility Principle, as it allows functionality
     *     to be divided between classes with unique areas of concern.
     *
     *     Decorator use can be more efficient than subclassing,
     *     because an object's behavior can be augmented without
     *     defining an entirely new object.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for entities behaviour.
     * 2. To create multiple entity implementations based on common interface.
     * 3. To create an abstract decorator implementation based on common interface.
     * 4. To create multiple decorator realisations based on decorator class.
     * 5. To add a bridge common interface variable into abstract decorator class.
     * 6. To add additional decoration methods (or overridden ones) to all decorators.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity class -> Computer [Laptop, Tablet, Mobile] { @Override void use(); }
     * 3. Decorator abstract class -> DeviceDecorator { @Override void use(); }
     * 4. Decorator classes -> DeviceDecorator [Cleaner, Driver, Switch, etc.]
     * 5. Bridge variable -> DeviceDecorator { private Device device; }
     * 6. Additional methods -> DeviceDecorator { prepare(), complete(), etc. }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[decorator]: process =================");
        var decorator = new DecoratorInvoker();
        decorator.invoke();
        log.info("=================================================================");
    }
}
