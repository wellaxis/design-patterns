package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

/**
 * Desc: Eager initialized singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }
}
