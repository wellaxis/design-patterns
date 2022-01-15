package com.witalis.design.patterns.pattern.creational.lazy;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.lazy.content.LazyInitializationInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Lazy initialization pattern
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Pattern(
    name = "Lazy Initialization",
    type = Classification.CREATIONAL,
    isClassical = false
)
public class LazyInitialization implements IPattern {

    /**
     * Definition:
     * -----------
     * Lazy Initialization -> tactic of delaying the creation of an object,
     *     the calculation of a value, or some other expensive process
     *     until the first time it is needed. This pattern appears in the GoF catalog
     *     as "virtual proxy", an implementation strategy for the Proxy pattern.
     *
     * Algorithm:
     * ----------
     * 1. To create an entity interface with required methods.
     * 2. To create an enumeration of all entity types.
     * 3. To create an abstract class for multiple entities implementations.
     * 4. To add memory map with all required entities (key - type, value - instance).
     * 5. To set constructor as private to force the use of the factory method.
     * 6. To add static factory method for lazy initialization & cache storing.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity enumeration -> DeviceType [Laptop, Tablet, Mobile]
     * 3. Abstract class -> Computer [id, name, price, active]
     * 4. Memory map -> Computer { devices = new ConcurrentHashMap<DeviceType, Device>(); }
     * 5. Constructor -> private Computer(DeviceType type) {}
     * 4. Factory method -> Computer { Device getDeviceByType(DeviceType type); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[lazy-initialization]: process =======");
        var lazyInitialization = new LazyInitializationInvoker();
        lazyInitialization.invoke();
        log.info("=================================================================");
    }
}
