package com.witalis.design.patterns.pattern.behavioral.observer;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.observer.content.ObserverInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Observer pattern
 * User: Wellaxis
 * Date: 20.01.2022
 */
@Slf4j
@Pattern(
    name = "Observer",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class Observer implements IPattern {

    /**
     * Definition:
     * -----------
     * Observer ->  is a software design pattern in which an object, named the subject,
     *     maintains a list of its dependents, called observers, and notifies them automatically
     *     of any state changes, usually by calling one of their methods.
     *
     *     It is mainly used for implementing distributed event handling systems,
     *     in "event driven" software (the subject is usually named a "stream of events").
     *
     *     The sole responsibility of a subject is to maintain a list of observers
     *     and to notify them of state changes by calling their update() operation.
     *     The responsibility of observers is to register (and unregister) themselves
     *     on a subject (to get notified of state changes) and to update their state
     *     (synchronize their state with the subject's state) when they are notified.
     *     This makes subject and observers loosely coupled.
     *     Subject and observers have no explicit knowledge of each other.
     *     Observers can be added and removed independently at run-time.
     *
     *     This notification-registration interaction is also known as publish-subscribe.
     *
     * Algorithm:
     * ----------
     * 1. To create observer interface for set of observer entities.
     * 2. To create observers as entity implementations based on observer interface.
     * 3. To create observable interface for subject entity.
     * 4. To create subject implementation based on observable interface.
     * 5. To add methods to subject to register/unregister & notify observers.
     * 6. To add methods to observers to update their state via notification.
     *
     * Example:
     * --------
     * 1. Observer interface -> Observer { void update(); }
     * 2. Observer classes -> Computer [Laptop, Mobile, Tablet] { void update(); }
     * 3. Observable interface -> Observable { register(), unregister(), notify(); }
     * 4. Observable class -> Software { List<Observer> observers; }
     * 5. Observable methods -> Software { register(), unregister(), notify(); }
     * 6. Observer methods -> Computer { void update(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[observer]: process ==================");
        var observer = new ObserverInvoker();
        observer.invoke();
        log.info("=================================================================");
    }
}
