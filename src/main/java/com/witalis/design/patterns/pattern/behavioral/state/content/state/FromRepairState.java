package com.witalis.design.patterns.pattern.behavioral.state.content.state;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: From Repair state
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
public class FromRepairState implements WorkingState {

    @Override
    public void condition() {
        log.info("\t# Device is ready to work. Pick it up from repair...");
    }
}
