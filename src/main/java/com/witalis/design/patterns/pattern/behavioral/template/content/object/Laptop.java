package com.witalis.design.patterns.pattern.behavioral.template.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 19.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, String comments) {
        super(name, comments);
    }

    @Override
    protected void charge() {
        log.info("\t> Power unit charging...");
    }

    @Override
    protected void turnOn() {
        log.info("\t> Operation system loading...");
    }

    @Override
    protected void handle() {
        log.info("\t> Install drivers... Develop the computer program...");
    }

    @Override
    protected void turnOff() {
        log.info("\t> Shut down the operation system...");
    }

    @Override
    protected void clean() {
        log.info("\t> Vacuum the laptop's keyboard...");
    }
}
