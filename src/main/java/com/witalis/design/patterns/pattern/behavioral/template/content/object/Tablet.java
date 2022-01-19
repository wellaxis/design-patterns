package com.witalis.design.patterns.pattern.behavioral.template.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 19.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name);
    }

    public Tablet(String name, String comments) {
        super(name, comments);
    }

    @Override
    protected void charge() {
        log.info("\t> Universal Serial Bus charging...");
    }

    @Override
    protected void turnOn() {
        log.info("\t> Press the power button...");
    }

    @Override
    protected void handle() {
        log.info("\t> Play online game... Watch a new film...");
    }

    @Override
    protected void turnOff() {
        log.info("\t> Press the power button again...");
    }

    @Override
    protected void clean() {
        log.info("\t> Wipe with a damp cloth...");
    }
}
