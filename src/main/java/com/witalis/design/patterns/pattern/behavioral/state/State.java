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
     * Visitor -> allows an object to change its behavior based on its state.
     *     The state pattern is used in computer programming to encapsulate
     *     varying behavior for the same object, based on its internal state.
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
     * 1. State interface -> ChargingState { void charge(); }.
     * 2. State classes -> [PowerUnit, USB, Wireless] { void charge(); }.
     * 3. Entity interface -> Device { void use(); }
     * 4. Entity abstract class -> Computer { private Charging charging; }
     * 5. Entity classes -> [Laptop, Tablet, Mobile] { void changeCharge(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[state]: process =====================");
        var state = new StateInvoker();
        state.invoke();
        log.info("=================================================================");
    }
}
