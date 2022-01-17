package com.witalis.design.patterns.pattern.behavioral.memento;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.memento.content.MementoInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Memento pattern
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
@Pattern(
    name = "Memento",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class Memento implements IPattern {

    /**
     * Definition:
     * -----------
     * Memento -> provides the ability to restore an object to its previous state
     *     (undo via rollback). It allows you to save the current state of the object,
     *     later this state can be restored. Doesn't break encapsulation.
     *
     *     Pattern is implemented with three objects:
     *     1) an originator (some object that has an internal state via its variables)
     *     2) a caretaker (do something to the originator & able to undo the change)
     *     3) a memento (store state of originator, readonly mode - all vars are final)
     *
     * Algorithm:
     * ----------
     * 1. To create common interface for set of entities.
     * 2. To create originator entity implementations based on common interface.
     * 3. To create memento class to store entities states.
     * 4. To create caretaker class to operate with entities states.
     * 5. To add methods to originator to store/restore entities states.
     * 6. To add methods to caretaker to get/set memento instances.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Originator classes -> Computer [Laptop, Mobile, Tablet] { void use(); }
     * 3. Memento class -> DeviceMemento { private final int version; }
     * 4. Caretaker class -> DeviceCaretaker { Map<DeviceType, DeviceMemento> mementos; }
     * 5. Originator methods -> Computer { DeviceMemento save(); void load(DeviceMemento memento); }
     * 6. Caretaker methods -> DeviceCaretaker { getMemento(), setMemento(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[memento]: process ===================");
        var memento = new MementoInvoker();
        memento.invoke();
        log.info("=================================================================");
    }
}
