package com.witalis.design.patterns.pattern.structural.composite;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.composite.content.CompositeInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Composite pattern
 * User: Wellaxis
 * Date: 12.01.2022
 */
@Slf4j
@Pattern(
    name = "Composite",
    type = Classification.STRUCTURAL
)
public class Composite implements IPattern {

    /**
     * Definition:
     * -----------
     * Composite -> is a partitioning design pattern.
     *     The composite pattern describes a group of objects that are treated
     *     the same way as a single instance of the same type of object.
     *
     *     A single entity and a composite class implement a common interface.
     *
     *     The intent of a composite is to "compose" objects into tree structures
     *     to represent part-whole hierarchies. Implementing the composite pattern
     *     lets clients treat individual objects and compositions uniformly.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for entities behaviour.
     * 2. To create an entity implementation based on common interface.
     * 3. To create a composite implementation based on common interface.
     * 4. To add collection to store all leaf entities into composite class.
     * 5. To add all methods to manipulate children from composite class.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity class -> Computer [Laptop, Tablet, Mobile] { @Override void use(); }
     * 3. Composite class -> ComputerClub { @Override void use(); }
     * 4. Composite collection -> ComputerClub { Map<UUID, Device> devices; }
     * 5. Composite methods -> ComputerClub { add(), get(), remove(), clear(), etc. }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[composite]: process =================");
        var composite = new CompositeInvoker();
        composite.invoke();
        log.info("=================================================================");
    }
}
