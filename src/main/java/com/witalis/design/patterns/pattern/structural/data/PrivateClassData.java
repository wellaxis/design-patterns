package com.witalis.design.patterns.pattern.structural.data;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.data.content.PrivateClassDataInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Private class data pattern
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Pattern(
    name = "Private class data",
    type = Classification.STRUCTURAL,
    isClassical = false
)
public class PrivateClassData implements IPattern {

    /**
     * Definition:
     * -----------
     * Private Class Data -> seeks to reduce exposure of attributes by limiting their visibility.
     *     It reduces the number of class attributes by encapsulating them in single Data object.
     *
     *     A class may expose its attributes (class variables) to manipulation when
     *     manipulation is no longer desirable, e.g. after construction.
     *     Using the private class data design pattern prevents that undesirable manipulation.
     *
     *     Intent:
     *     * Control write access to class attributes
     *     * Separate data from methods that use it
     *     * Encapsulate class data initialization
     *     * Providing new type of final -> final after constructor
     *
     *     The motivation for this design pattern comes from the design goal of
     *     protecting class state by minimizing the visibility of its attributes (data).
     *
     * Algorithm:
     * ----------
     * 1. To create common interface for set of entities.
     * 2. To create immutable data class to hide all attributes.
     * 3. To create multiple entities implementations based on common interface.
     * 4. To add constructor for data class initialization into base common class.
     * 5. To add getter methods into data class to expose each attribute.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Data class -> DeviceData { private final id, name, comments, price, etc. }
     * 3. Entity classes -> Computer [Laptop, Tablet, Mobile] { DeviceData data; }
     * 4. Entity constructor -> Computer { this.data = new DeviceData(...); }
     * 5. Getter methods -> DeviceData { getId(), getName(), getComments(), etc. }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[private-class-data]: process ========");
        var privateClassData = new PrivateClassDataInvoker();
        privateClassData.invoke();
        log.info("=================================================================");
    }
}
