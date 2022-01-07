package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name, new NewState());
    }

    @Override
    public void use() {
        var state = getWorkingState();

        if (state instanceof NewState) {
            log.info("\t> Check IMEI identity...");
            log.info("\t> Define tablet settings...");
        } else if (state instanceof ReadyState) {
            log.info("\t> Play online game...");
            log.info("\t> Watch a new film...");
        } else if (state instanceof BrokenState) {
            log.info("\t> Unable to fix all errors...");
        } else if (state instanceof RepairedState) {
            log.info("\t> All problems have been fixed.");
        } else if (state instanceof ForRepairState) {
            log.info("\t> Tablet is on the way to fix. Wait...");
        } else if (state instanceof FromRepairState) {
            log.info("\t> Tablet is on the way to home. Wait...");
        }
    }
}
