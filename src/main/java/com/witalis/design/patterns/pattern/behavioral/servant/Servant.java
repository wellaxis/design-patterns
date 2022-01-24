package com.witalis.design.patterns.pattern.behavioral.servant;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.servant.content.ServantInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Servant pattern
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Pattern(
    name = "Servant",
    type = Classification.BEHAVIORAL,
    isClassical = false
)
public class Servant implements IPattern {

    /**
     * Definition:
     * -----------
     * Servant -> defines an object used to offer some functionality to a group
     *     of classes without defining that functionality in each of them.
     *     A Servant is a class whose instance (or even just class) provides
     *     methods that take care of a desired service, while objects for which
     *     (or with whom) the servant does something, are taken as parameters.
     *
     *     Servant is used for providing some behavior to a group of classes.
     *     Instead of defining that behavior in each class - or when we cannot
     *     factor out this behavior in the common parent class - it is defined
     *     once in the Servant. Design patterns Command and Servant are very similar
     *     and implementations of them are often virtually the same.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for set of entities.
     * 2. To create multiple implementation classes based on common interface.
     * 3. To create a servant interface to take care of common entities.
     * 4. To create multiple implementation classes based on servant interfaces.
     * 5. To add servant methods with common entities as parameters.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { charge(), use(), clean(), etc. }
     * 2. Entity classes -> Computer [Laptop, Mobile, Tablet], { void use(), etc. }
     * 3. Servant interface -> Session { prepare(), process(), complete(), etc. }
     * 4. Servant classes -> BaseSession [Safe, Open], { void process(), etc. }
     * 5. Servant methods -> BaseSession { @Override void complete(Device device); etc. }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[servant]: process ===================");
        var servant = new ServantInvoker();
        servant.invoke();
        log.info("=================================================================");
    }
}
