package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

/**
 * Desc: Enumeration singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public enum EnumSingleton {
    INSTANCE;

    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
