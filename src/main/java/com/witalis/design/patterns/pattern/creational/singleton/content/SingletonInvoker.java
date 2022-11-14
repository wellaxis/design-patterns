package com.witalis.design.patterns.pattern.creational.singleton.content;

import com.witalis.design.patterns.pattern.creational.singleton.content.singleton.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker singleton pattern
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
public class SingletonInvoker {

    public void invoke() {
        log.info("\tSingleton: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            log.info("\t# Singleton Types:");

            // eager initialization
            var eager = EagerInitializedSingleton.getInstance();
            log.info("\t> Eager init: {}", eager);

            // static block initialization
            var block = StaticBlockSingleton.getInstance();
            log.info("\t> Static block: {}", block);

            // lazy initialization
            var lazy = LazyInitializedSingleton.getInstance();
            log.info("\t> Lazy init: {}", lazy);

            // thread safe initialization
            var safe = ThreadSafeSingleton.getInstance();
            log.info("\t> Thread safe: {}", safe);

            // double-checked locking initialization
            var lock = DoubleCheckedLockingSingleton.getInstance();
            log.info("\t> Double-checked locking: {}", lock);

            // Bill Pugh's initialization
            var inner = BillPughSingleton.getInstance();
            log.info("\t> Inner class: {}", inner);

            // enum initialization
            var enumeration = EnumSingleton.getInstance();
            log.info("\t> Enumeration: {}", enumeration);

            // serialized initialization
            var serial = SerializedSingleton.getInstance();
            log.info("\t> Serialized: {}", serial);

            // virtual proxy initialization
            var proxy = VirtualProxySingleton.getInstance();
            log.info("\t> Virtual proxy: {}", proxy);

            log.info("");

        } catch (Exception e) {
            log.error("\tSingleton: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tSingleton: end, time = {} ms", (end - begin) / 1000);
    }
}
