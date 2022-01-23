package com.witalis.design.patterns.pattern.behavioral.nulls;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.nulls.content.NullObjectInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Null object pattern
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Pattern(
    name = "Null object",
    type = Classification.BEHAVIORAL,
    isClassical = false
)
public class NullObject implements IPattern {

    /**
     * Definition:
     * -----------
     * Null Object -> describes the uses of null objects and their behavior (or lack thereof).
     *     A null object is an object with no referenced value or with defined neutral (null) behavior.
     *
     *     Instead of using a null reference to convey absence of an object
     *     (for instance, a non-existent customer), one uses an object
     *     which implements the expected interface, but whose method body is empty.
     *     The advantage of this approach over a working default implementation
     *     is that a null object is very predictable and has no side effects: it does nothing.
     *
     *     The null object pattern can also be used to act as a stub for testing,
     *     if a certain feature such as a database is not available for testing.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for set of entities.
     * 2. To create real implementation classes based on common interface.
     * 3. To create null implementation class based on common interface.
     * 4. To implement the common methods for real classes (business logic).
     * 5. To implement the common methods for null class (empty bodies).
     *
     * Example:
     * --------
     * 1. Common interface -> Device { void use(); }
     * 2. Real classes -> Computer [Laptop, Mobile, Tablet] { void use(); }
     * 3. Null class -> NullDevice { void use(); }
     * 4. Real methods -> Laptop { @Override public void use() { ... } }
     * 5. Null methods -> NullDevice { @Override public void use() {} }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[null-object]: process ===============");
        var nullObject = new NullObjectInvoker();
        nullObject.invoke();
        log.info("=================================================================");
    }
}
