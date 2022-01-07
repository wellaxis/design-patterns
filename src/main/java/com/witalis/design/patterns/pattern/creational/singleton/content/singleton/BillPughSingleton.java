package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

/**
 * Desc: Bill Pugh's singleton
 * User: Wellaxis
 * Date: 07.01.2022
 */
public class BillPughSingleton {

    private BillPughSingleton() {
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
