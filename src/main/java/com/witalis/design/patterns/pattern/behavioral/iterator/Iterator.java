package com.witalis.design.patterns.pattern.behavioral.iterator;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.iterator.content.IteratorInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Iterator pattern
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Pattern(
    name = "Iterator",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class Iterator implements IPattern {

    /**
     * Definition:
     * -----------
     * Iterator ->  is a design pattern in which an iterator is used to traverse
     *     a container and access the container's elements. The iterator pattern
     *     decouples algorithms from containers; in some cases, algorithms are
     *     necessarily container-specific and thus cannot be decoupled.
     *
     *     Defining access and traversal operations in the aggregate interface
     *     is inflexible because it commits the aggregate to particular access
     *     and traversal operations and makes it impossible to add new operations
     *     later without having to change the aggregate interface.
     *
     *     Different iterators can be used to access and traverse an aggregate
     *     in different ways. New access and traversal operations can be defined
     *     independently by defining new iterators.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for set of entities.
     * 2. To create an iterator interface to traverse entities details.
     * 3. To create an aggregator interface to store entities details.
     * 4. To create implementation classes based on common & aggregator interfaces.
     * 5. To add inner iterator implementation to entities implementations.
     * 6. To implement aggregator methods to process entities details.
     * 7. To implement iterator methods to traverse entities details.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Iterator interface -> Iterator { boolean hasNext(), next(), first(), last(); }
     * 3. Aggregator interface -> Aggregator { Iterator iterator(); }
     * 4. Entity classes -> Computer [Laptop, Mobile, Tablet], { void use(); }
     * 5. Inner iterator -> Computer { private class DriverIterator implements Iterator }
     * 6. Aggregator methods -> Computer { @Override iterator = new DriverIterator(); }
     * 7. Iterator methods -> Computer { @Override boolean hasNext(), next(), first(), last(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[iterator]: process ==================");
        var iterator = new IteratorInvoker();
        iterator.invoke();
        log.info("=================================================================");
    }
}
