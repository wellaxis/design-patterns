package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

/**
 * Desc: Thread safe singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public class ThreadSafeSingleton {
    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            instance = new ThreadSafeSingleton();
        }
        return instance;
    }
}
