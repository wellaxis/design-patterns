package com.witalis.design.patterns.pattern.behavioral.mediator;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.mediator.content.MediatorInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mediator pattern
 * User: Wellaxis
 * Date: 21.01.2022
 */
@Slf4j
@Pattern(
    name = "Mediator",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class Mediator implements IPattern {

    /**
     * Definition:
     * -----------
     * Mediator -> defines an object that encapsulates how a set of objects interact.
     *     With the mediator pattern, communication between objects is encapsulated
     *     within a mediator object. Objects no longer communicate directly with each other,
     *     but instead communicate through the mediator. This reduces the dependencies
     *     between communicating objects, thereby reducing coupling.
     *
     *     Solution:
     *     1) Define a separate (mediator) object that encapsulates the interaction between a set of objects.
     *     2) Objects delegate their interaction to a mediator object instead of interacting with each other directly.
     *
     *     The objects interact with each other indirectly through a mediator object
     *     that controls and coordinates the interaction. This makes the objects loosely coupled.
     *     They only refer to and know about their mediator object and have no explicit knowledge of each other.
     *
     * Algorithm:
     * ----------
     * 1. To create colleague interface for set of entities.
     * 2. To create colleague entity implementations based on colleague interface.
     * 3. To create mediator interface for entities interactions.
     * 4. To create mediator class to coordinate entities communication.
     * 5. To add mediate method to mediator for controlling interaction.
     * 6. To add action method to colleagues for interaction via mediator.
     *
     * Example:
     * --------
     * 1. Colleague interface -> Device { use(), readMessage(), sendMessage(); }
     * 2. Colleague classes -> Computer [Laptop, Mobile, Tablet] { read/sendMessage(); }
     * 3. Mediator interface -> Mediator { void send(Device device, String message); }
     * 4. Mediator class -> Messenger { private List<Device> devices; }
     * 5. Mediate method -> Messenger { void mediate(Device device, String message); }
     * 6. Action methods -> Computer { sendMessage() { mediator.mediate(this, message); } }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[mediator]: process ==================");
        var mediator = new MediatorInvoker();
        mediator.invoke();
        log.info("=================================================================");
    }
}
