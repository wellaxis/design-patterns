package com.witalis.design.patterns.pattern.behavioral.strategy;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.strategy.content.StrategyInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Strategy pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Pattern(
    name = "Strategy",
    type = Classification.BEHAVIORAL
)
public class Strategy implements IPattern {

    /**
     * Definition:
     * -----------
     * Strategy -> defines a family of algorithms, encapsulate each one,
     *     and make them interchangeable. Strategy lets the algorithm
     *     vary independently of clients that use it. The strategy algorithm
     *     can be changed during program execution.
     *
     *     Based upon the Open closed design principle,
     *     represents ‘O’ from SOLID design principles.
     *
     *     The pattern Strategy makes it easy to add a new strategy
     *     without changing the context of the object.
     *
     *     The client is free to choose any Strategy implementation of his choice.
     *     It is not required to have the order of strategies use.
     *
     *     Changing the Strategy is performed by the Client.
     *     Changing the State can be performed by the context or the state of the object independently.
     *
     * Algorithm:
     * ----------
     * 1. To create a strategy interface with required methods.
     * 2. To create implementation classes of a strategy interface.
     * 3. To create a basic interface for entity behaviour.
     * 4. To create a context entity class with a strategy variable.
     * 5. To set up an initial entity strategy & setter method set it.
     *
     * Example:
     * --------
     * 1. State interface -> ChargingStrategy { void charge(); }.
     * 2. State classes -> [PowerUnit, USB, Wireless] { void charge(); }.
     * 3. Entity interface -> Device { void use(); }
     * 4. Entity abstract class -> Computer { private ChargingStrategy chargingStrategy; }
     * 5. Entity classes -> [Laptop, Tablet, Mobile] { void setChargingStrategy(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[strategy]: process ==================");
        var strategy = new StrategyInvoker();
        strategy.invoke();
        log.info("=================================================================");
    }
}
