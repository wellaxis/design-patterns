package com.witalis.design.patterns.pattern.behavioral.state;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.state.content.StateInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: State pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Pattern(
    name = "State",
    type = Classification.BEHAVIORAL
)
public class State implements IPattern {

    /**
     * Definition:
     * -----------
     * State -> allows an object to change its behavior based on its state.
     *     The state pattern is used in computer programming to encapsulate
     *     varying behavior for the same object, based on its internal state.
     *
     *     Based upon the Open closed design principle,
     *     represents ‘O’ from SOLID design principles.
     *
     *     The pattern State makes it easy to add a new state
     *     without changing the context of the object.
     *
     *     The order of state transition is well-defined in the State pattern;
     *     there is no such requirement for the Strategy pattern.
     *
     *     Changing the State can be performed by the context or the state of the object independently.
     *     Changing the Strategy is performed by the Client.
     *
     * Algorithm:
     * ----------
     * 1. To create a state interface with required methods.
     * 2. To create implementation classes of a state interface.
     * 3. To create a basic interface for entity behaviour.
     * 4. To create a context entity class with a state variable.
     * 5. To set up an initial entity state & method to change state.
     *
     * Example:
     * --------
     * 1. State interface -> WorkingState { void condition(); }.
     * 2. State classes -> [New, Broken, Repaired, Ready, etc.] { void condition(); }.
     * 3. Entity interface -> Device { void use(); }
     * 4. Entity abstract class -> Computer { private WorkingState workingState; }
     * 5. Entity classes -> [Laptop, Tablet, Mobile] { void use(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[state]: process =====================");
        var state = new StateInvoker();
        state.invoke();
        log.info("=================================================================");
    }
}
