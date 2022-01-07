package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name, new NewState());
    }

    @Override
    public void use() {
        var state = getWorkingState();

        if (state instanceof NewState) {
            log.info("\t> Insert SIM card...");
            log.info("\t> Define phone settings...");
        } else if (state instanceof ReadyState) {
            log.info("\t> Call to your friends...");
            log.info("\t> Check youtube videos...");
        } else if (state instanceof BrokenState) {
            log.info("\t> Error in any application...");
        } else if (state instanceof RepairedState) {
            log.info("\t> All problems have been fixed.");
        } else if (state instanceof ForRepairState) {
            log.info("\t> Phone is on the way to fix. Wait...");
        } else if (state instanceof FromRepairState) {
            log.info("\t> Phone is on the way to home. Wait...");
        }
    }
}
