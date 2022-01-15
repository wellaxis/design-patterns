package com.witalis.design.patterns.pattern.creational.pool;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.pool.content.ObjectPoolInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Object pool pattern
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
@Pattern(
    name = "Object Pool",
    type = Classification.CREATIONAL,
    isClassical = false
)
public class ObjectPool implements IPattern {

    /**
     * Definition:
     * -----------
     * Object Pool -> pattern can significantly improve system performance;
     *     its use is most effective in situations where the creation of instances
     *     of a certain class is expensive, objects in the system are created frequently,
     *     but the number of objects created per unit of time is limited.
     *
     *     The main idea behind the Object Pool pattern is to avoid
     *     creating new instances of a class if they can be reused.
     *
     *     Object pools (also known as resource pools) are used to manage object caching.
     *     A client with access to an object pool can avoid creating new objects
     *     by simply requesting an already created instance in the pool.
     *     The pool of objects can be growing when, in the absence of free objects,
     *     new objects are created, or with a limitation on the number of objects created.
     *
     * Algorithm:
     * ----------
     * 1. To create an entity interface with required methods.
     * 2. To create an entity implementation class.
     * 3. To create an entity pool to manage entities life cycles.
     * 4. To add methods to operate on entities (get & release).
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity class -> Computer [id, name, active]
     * 4. Entity pool -> ComputerPool { available = new HashMap<Device, Long>(); }
     * 5. Pool methods -> ComputerPool { Device receive(); void release(Device device); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[object-pool]: process ===============");
        var objectPool = new ObjectPoolInvoker();
        objectPool.invoke();
        log.info("=================================================================");
    }
}
