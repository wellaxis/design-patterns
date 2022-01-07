package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

/**
 * Desc: Lazy initialized singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public class LazyInitializedSingleton {
    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
    }

    public static LazyInitializedSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }
}
