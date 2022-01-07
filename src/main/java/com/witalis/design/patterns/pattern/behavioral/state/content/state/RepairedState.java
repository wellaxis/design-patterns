package com.witalis.design.patterns.pattern.behavioral.state.content.state;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Repaired state
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
public class RepairedState implements WorkingState {

    @Override
    public void condition() {
        log.info("\t# Device has been repaired. Сan pick it up.");
    }
}
