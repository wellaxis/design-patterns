package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

/**
 * Desc: Static block singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    private StaticBlockSingleton() {
    }

    // static block initialization for exception handling
    static {
        try {
            instance = new StaticBlockSingleton();
        } catch(Exception e) {
            throw new RuntimeException("Initialization errors");
        }
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }
}
