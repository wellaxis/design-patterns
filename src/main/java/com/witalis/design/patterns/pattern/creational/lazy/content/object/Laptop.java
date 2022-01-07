package com.witalis.design.patterns.pattern.creational.lazy.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
public class Laptop extends Computer {
    private int cpu;

    protected Laptop() {
        super();
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
