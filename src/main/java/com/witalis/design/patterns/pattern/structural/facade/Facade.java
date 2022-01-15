package com.witalis.design.patterns.pattern.structural.facade;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.facade.content.FacadeInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Facade pattern
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Pattern(
    name = "Facade",
    type = Classification.STRUCTURAL,
    isClassical = true
)
public class Facade implements IPattern {

    /**
     * Definition:
     * -----------
     * Facade -> defines a higher-level interface that makes the subsystem easier to use.
     *     Provide a unified interface to a set of interfaces in a subsystem.
     *
     *     Analogous to a facade in architecture, a facade is an object that serves
     *     as a front-facing interface masking more complex underlying or structural code.
     *
     *     A Facade is used when an easier or simpler interface to an underlying object
     *     is desired. It hides a complex system of different classes by casting all calls
     *     to a single object. Includes several complex objects in one object.
     *
     *     Developers often use the facade design pattern when a system is very complex
     *     or difficult to understand because the system has many interdependent classes
     *     or because its source code is unavailable.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for entities behaviour.
     * 2. To create multiple various entities with different behaviour.
     * 3. To create a facade interface to simplifier system processing.
     * 4. To create a facade implementation based on facade interface.
     * 5. To add inner encapsulated entities variables to store their instances.
     * 6. To add generalized base methods to invoke entities methods.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { }
     * 2. Entity class -> Computer [Laptop, Tablet, Mobile] { different methods }
     * 3. Facade interface -> DeviceFacade { startSession(), stopSession() }
     * 4. Facade class -> ComputerClub [ implements DeviceFacade ]
     * 5. Facade variables -> ComputerClub { Laptop laptop, Tablet tablet, Mobile mobile; }
     * 6. Facade methods -> ComputerClub { startSession(...), stopSession(...) }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[facade]: process ====================");
        var facade = new FacadeInvoker();
        facade.invoke();
        log.info("=================================================================");
    }
}
