package com.witalis.design.patterns.pattern.creational.prototype;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.prototype.content.PrototypeInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Prototype pattern
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Pattern(
    name = "Prototype",
    type = Classification.CREATIONAL
)
public class Prototype implements IPattern {

    /**
     * Definition:
     * -----------
     * Prototype -> specify the kinds of objects to create using a prototypical instance,
     *     and create new objects from the 'skeleton' of an existing object,
     *     thus boosting performance and keeping memory footprints to a minimum.
     *     It is used when the type of objects to create is determined by a prototypical instance,
     *     which is cloned to produce new objects. This pattern is used to avoid subclasses
     *     of an object creator in the client application.
     *
     *     Helps to create a duplicate object with better performance,
     *     instead of a new one, a returned clone of the existing object is created.
     *     Clones an existing object.
     *
     *     This pattern creates the kind of object using its prototype.
     *     In other words, while creating the object of Prototype object,
     *     the class creates a clone of it and returns it as prototype.
     *     The clone method has been used to clone the prototype when required.
     *
     *     - Cloning via super.clone() method -> non-compliant solution.
     *     + Cloning via constructor & abstract method -> compliant solution.
     *
     * Algorithm:
     * ----------
     * 1. To create an entity interface with required methods.
     * 2. To create an abstract class for multiple entities implementations.
     * 3.1 To add Cloneable interface & clone() { super.clone() } - non-compliant solution.
     * 3.2 To add Constructor with the same target type & abstract method for cloning - compliant solution.
     * 4. To implement multiple entities with cloning strategies (Clone vs Constructor).
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Abstract class -> Computer [id, name, price, active]
     * 3.1 Cloneable -> Computer clone() throws CloneNotSupportedException
     * 3.2 Constructor -> abstract Computer propagate();
     * 4. Entity classes -> [Laptop, Tablet, Mobile], { clone(), propagate() }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[prototype]: process =================");
        var prototype = new PrototypeInvoker();
        prototype.invoke();
        log.info("=================================================================");
    }
}
