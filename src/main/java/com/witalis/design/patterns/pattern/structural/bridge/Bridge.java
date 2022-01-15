package com.witalis.design.patterns.pattern.structural.bridge;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.bridge.content.BridgeInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Bridge pattern
 * User: Wellaxis
 * Date: 09.01.2022
 */
@Slf4j
@Pattern(
    name = "Bridge",
    type = Classification.STRUCTURAL,
    isClassical = true
)
public class Bridge implements IPattern {

    /**
     * Definition:
     * -----------
     * Bridge -> decouples an abstraction from its implementation
     *     allowing the two to vary independently. Makes concrete classes
     *     independent of interface implementation classes.
     *
     *     Changing functionality in one hierarchy does not entail changes in another.
     *
     *     Goal: flexibility. It is possible to change
     *     interfaces and implementations independently.
     *
     * Algorithm:
     * ----------
     * 1. To create abstraction interface for set of entities.
     * 2. To create multiple refined abstraction entity implementations based on abstraction interface.
     * 3. To create implementor interface for set of entities.
     * 4. To create multiple concrete implementor entity implementations based on implementor interface.
     * 5. To add bridge variable via composition to link two separate class hierarchies.
     *
     * Example:
     * --------
     * 1. Abstraction interface -> Advertising { void promote(); }
     * 2. Refined classes -> Advertiser [Internet, TV, Radio] { abstract void promoteDevice(); }
     * 3. Implementor interface -> Device { void use(); }
     * 4. Concrete classes -> Computer [Laptop, Tablet, Mobile] { void use(); }
     * 5. Bridge variable -> Advertiser { protected Device device; }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[bridge]: process ====================");
        var bridge = new BridgeInvoker();
        bridge.invoke();
        log.info("=================================================================");
    }
}
