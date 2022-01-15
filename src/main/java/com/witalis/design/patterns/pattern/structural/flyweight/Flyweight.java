package com.witalis.design.patterns.pattern.structural.flyweight;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.flyweight.content.FlyweightInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Flyweight pattern
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Pattern(
    name = "Flyweight",
    type = Classification.STRUCTURAL,
    isClassical = true
)
public class Flyweight implements IPattern {

    /**
     * Definition:
     * -----------
     * Flyweight -> refers to an object that minimizes memory usage
     *     by sharing some of its data with other similar objects.
     *
     *     Instead of creating a large number of similar objects,
     *     objects are reused. It saves memory. It's need to support
     *     a large number of objects (and identity is not important).
     *
     *     The flyweight pattern is useful when dealing with large numbers
     *     of objects with simple repeated elements that would use
     *     a large amount of memory if individually stored.
     *
     *     It is common to hold shared data in external data structures
     *     and pass it to the objects temporarily when they are used.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for entities behaviour.
     * 2. To create multiple entity implementations based on common interface.
     * 3. To create a flyweight class as factory realisation.
     * 4. To add a collection variable to store entities into flyweight class.
     * 5. To add a factory method to retrieve (get or initiate new) entities.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity class -> Computer [Laptop, Tablet, Mobile] { @Override void use(); }
     * 3. Flyweight factory class -> DeviceFlyweight
     * 4. Flyweight class -> DeviceFlyweight { Map<DeviceType, Map<Integer, Device>> devices; }
     * 6. Factory method -> DeviceFlyweight { Device getDeviceByType(DeviceType type, int id); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[flyweight]: process =================");
        var flyweight = new FlyweightInvoker();
        flyweight.invoke();
        log.info("=================================================================");
    }
}
