package com.witalis.design.patterns.pattern.creational.multiton;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.multiton.content.MultitonInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Multiton pattern
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
@Pattern(
    name = "Multiton",
    type = Classification.CREATIONAL,
    isClassical = false
)
public class Multiton implements IPattern {

    /**
     * Definition:
     * -----------
     * Multiton -> is a design pattern which generalizes the singleton pattern.
     *     Whereas the singleton allows only one instance of a class to be created,
     *     the multiton pattern allows for the controlled creation of multiple instances,
     *     which it manages through the use of a map.
     *
     *     Multiton is a registry of singletons.
     *
     *     Rather than having a single instance per application
     *     the multiton pattern instead ensures a single instance per key.
     *
     * Algorithm:
     * ----------
     * 1. To create an entity interface with required methods.
     * 2. To create an enumeration of all entity types.
     * 3. To create a multiton class for all unique entities implementations.
     * 4. To add memory map with all unique entities (key - type, value - instance).
     * 5. To set constructor as private to avoid initiate entities directly.
     * 6. To add static factory method for lazy initialization & cache storing.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity enumeration -> DeviceType [Laptop, Tablet, Mobile]
     * 3. Multiton class -> DeviceMultiton [id, name, active, type]
     * 4. Memory map -> DeviceMultiton { instances = new HashMap<DeviceType, Device>(); }
     * 5. Constructor -> private DeviceMultiton(DeviceType type) {}
     * 6. Factory method -> DeviceMultiton { Device getInstance(DeviceType type); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[multiton]: process ==================");
        var multiton = new MultitonInvoker();
        multiton.invoke();
        log.info("=================================================================");
    }
}
