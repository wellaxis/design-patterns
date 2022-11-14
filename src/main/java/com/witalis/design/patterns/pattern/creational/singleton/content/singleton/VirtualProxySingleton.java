package com.witalis.design.patterns.pattern.creational.singleton.content.singleton;

import java.util.function.Supplier;

/**
 * Desc: Virtual proxy singleton
 * User: Wellaxis
 * Date: 14.11.2022
 */
public class VirtualProxySingleton {

    private VirtualProxySingleton() {
    }

    private static class SingletonHolder {
        private static Supplier<VirtualProxySingleton> supplier = SingletonHolder::createInstance;

        public static VirtualProxySingleton getInstance() {
            return supplier.get();
        }

        private static synchronized VirtualProxySingleton createInstance() {
            class SingletonFactory implements Supplier<VirtualProxySingleton> {
                private static final VirtualProxySingleton INSTANCE = new VirtualProxySingleton();

                @Override
                public VirtualProxySingleton get() {
                    return INSTANCE;
                }
            }

            if (!(supplier instanceof SingletonFactory)) {
                supplier = new SingletonFactory();
            }

            return supplier.get();
        }
    }

    public static VirtualProxySingleton getInstance() {
        return VirtualProxySingleton.SingletonHolder.getInstance();
    }
}
