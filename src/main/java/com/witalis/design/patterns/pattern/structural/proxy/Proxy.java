package com.witalis.design.patterns.pattern.structural.proxy;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.proxy.content.ProxyInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Proxy pattern
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
@Pattern(
    name = "Proxy",
    type = Classification.STRUCTURAL,
    isClassical = true
)
public class Proxy implements IPattern {

    /**
     * Definition:
     * -----------
     * Proxy -> represents objects that can control other objects
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
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity class -> Computer { @Override void use(); }
     * 3. Proxy class -> SecureComputer { @Override void use(); }
     * 4. Proxy property -> SecureComputer { private Computer computer; }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[proxy]: process =====================");
        var proxy = new ProxyInvoker();
        proxy.invoke();
        log.info("=================================================================");
    }
}
