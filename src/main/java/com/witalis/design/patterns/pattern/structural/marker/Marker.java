package com.witalis.design.patterns.pattern.structural.marker;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.marker.content.MarkerInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Marker pattern
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Pattern(
    name = "Marker",
    type = Classification.STRUCTURAL,
    isClassical = false
)
public class Marker implements IPattern {

    /**
     * Definition:
     * -----------
     * Marker -> used with languages that provide run-time type information
     *     about objects. It provides a means to associate metadata with a class
     *     where the language does not have explicit support for such metadata.
     *
     *     To use this pattern, a class implements a marker interface
     *     (also called tagging interface), and methods that interact
     *     with instances of that class test for the existence of the interface.
     *
     *     A major problem with marker interfaces is that an interface defines a contract
     *     for implementing classes, and that contract is inherited by all subclasses.
     *     This means that you cannot "un-implement" a marker.
     *
     *     An example of the application of marker interfaces from
     *     the Java programming language is the Serializable interface.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for entities behaviour.
     * 2. To create an entity implementation based on common interface.
     * 3. To create a marker interface for metadata processing.
     * 4. To add marker processing based on entity instance implementations.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity class -> Computer [Laptop, Tablet, Mobile, etc.] { @Override void use(); }
     * 3. Marker interface -> Printable { }
     * 4. Marker processing -> Computer { @Override public String toString() }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[marker]: process ====================");
        var marker = new MarkerInvoker();
        marker.invoke();
        log.info("=================================================================");
    }
}
