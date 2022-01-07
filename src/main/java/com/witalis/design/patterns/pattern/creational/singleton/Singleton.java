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
    type = Classification.STRUCTURAL
)
public class Singleton implements IPattern {

    /**
     * Definition:
     * -----------
     * Singleton -> represents objects that can control other objects
     *     by intercepting their calls. It is possible to intercept
     *     the call to the original object. Provide a placeholder
     *     for another object to control access to it.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for entities behaviour.
     * 2. To create an entity implementation based on common interface.
     * 3. To create a proxy implementation based on common interface.
     * 4. To add an entity property into a proxy class.
     *
     * Example:
     * --------
     * 1. Entity interface -> Loadable { void load(); }
     * 2. Entity class -> Loader { @Override void load(); }
     * 3. Proxy class -> LoaderProxy { @Override void load(); }
     * 4. Proxy property -> Loader { private Loader loader; }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[singleton]: process =================");
        var singleton = new SingletonInvoker();
        singleton.invoke();
        log.info("=================================================================");
    }
}
