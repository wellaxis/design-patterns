package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

/**
 * Desc: Double-checked locking singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public class DoubleCheckedLockingSingleton {
    private static volatile DoubleCheckedLockingSingleton instance;

    private DoubleCheckedLockingSingleton() {
    }

    public static DoubleCheckedLockingSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedLockingSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
