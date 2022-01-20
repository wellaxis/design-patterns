package com.witalis.design.patterns.pattern.behavioral.observer.content.observer;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * Desc: Software class
 * User: Wellaxis
 * Date: 20.01.2022
 */
@Slf4j
@Data
public class Software implements Observable {
    private String name;
    private List<Observer> observers;
    private String token;
    private int version;

    public Software(String name) {
        this.name = name;
        this.observers = new ArrayList<>();
        this.token = "";
        this.version = 0;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(
            observer -> observer.update(token, version, LocalDateTime.now())
        );
    }

    public void upgrade(String token, int version) {
        this.token = token;
        this.version = version;
        log.info("\t# Critical upgrade for software '{}' has been published!", getName());

        notifyObservers();
    }

    public void display() {
        observers.forEach(
            observer -> log.info("\t> {}", observer.toString())
        );
    }

    @Override
    public String toString() {
        return "Software: [name='" + name + "', token='" + token + "', version=" + version + "]";
    }
}
