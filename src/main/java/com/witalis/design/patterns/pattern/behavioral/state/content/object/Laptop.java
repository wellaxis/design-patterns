package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name, new NewState());
    }

    @Override
    public void use() {
        var state = getWorkingState();

        if (state instanceof NewState) {
            log.info("\t> Operation system loading...");
            log.info("\t> Define computer settings...");
        } else if (state instanceof ReadyState) {
            log.info("\t> Operation system loading...");
            log.info("\t> Develop computer program...");
        } else if (state instanceof BrokenState) {
            log.info("\t> A blue screen error...");
        } else if (state instanceof RepairedState) {
            log.info("\t> All problems have been fixed.");
        } else if (state instanceof ForRepairState) {
            log.info("\t> Laptop is on the way to fix. Wait...");
        } else if (state instanceof FromRepairState) {
            log.info("\t> Laptop is on the way to home. Wait...");
        }
    }
}
