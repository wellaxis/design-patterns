package com.witalis.design.patterns.pattern.creational.singleton;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.singleton.content.SingletonInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Singleton pattern
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Pattern(
    name = "Singleton",
    type = Classification.CREATIONAL
)
public class Singleton implements IPattern {

    /**
     * Definition:
     * -----------
     * Singleton -> ensures a class has only one instance, and provide
     *     a global point of access to it. The class constructor is private.
     *     Restricts the creation of one instance of a class.
     *     The getInstance() method only creates one instance of the class.
     *
     * Types:
     * ------
     * 1. Eager initialization - created even though client application might not be using it.
     * 2. Static block initialization - the same, but provides option for exception handling.
     * 3. Lazy initialization - works fine in case of the single-threaded environment only.
     * 4. Thread safe initialization - reduces the performance because of the synchronized method.
     * 5. Double-checked locking initialization - avoid extra overhead every time is used.
     * 6. Bill Pugh's initialization - init via inner static class, it does not require synchronization.
     * 7. Enumeration initialization - protect from reflection, but does not allow lazy initialization.
     * 8. Serialized initialization - deserialization creates new instance, so add readResolve() method.
     *
     * Example:
     * --------
     * 1. Class -> EagerInitializedSingleton
     * 2. Class -> StaticBlockSingleton
     * 3. Class -> LazyInitializedSingleton
     * 4. Class -> ThreadSafeSingleton
     * 5. Class -> DoubleCheckedLockingSingleton
     * 6. Class -> BillPughSingleton
     * 7. Enum -> EnumSingleton
     * 8. Class -> SerializedSingleton
     */
    @Override
    public void process() {
        log.info("=================== Pattern[singleton]: process =================");
        var singleton = new SingletonInvoker();
        singleton.invoke();
        log.info("=================================================================");
    }
}
