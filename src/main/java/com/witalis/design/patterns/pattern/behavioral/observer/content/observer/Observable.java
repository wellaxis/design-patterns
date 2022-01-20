package com.witalis.design.patterns.pattern.behavioral.observer.content.observer;

/**
 * Desc: Observable interface
 * User: Wellaxis
 * Date: 20.01.2022
 */
public interface Observable {
    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void notifyObservers();
}
