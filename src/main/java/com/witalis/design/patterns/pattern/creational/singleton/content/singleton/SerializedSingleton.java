package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

import java.io.Serial;
import java.io.Serializable;

/**
 * Desc: Serialized singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public class SerializedSingleton implements Serializable {
    private static final long serialVersionUID = -7604766932017737115L;

    private SerializedSingleton() {
    }

    private static class SingletonHelper{
        private static final SerializedSingleton instance = new SerializedSingleton();
    }

    public static SerializedSingleton getInstance(){
        return SingletonHelper.instance;
    }

    @Serial
    public Object readResolve() {
        return SerializedSingleton.getInstance();
    }
}
