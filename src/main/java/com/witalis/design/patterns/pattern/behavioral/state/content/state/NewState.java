package com.witalis.design.patterns.pattern.behavioral.state.content.state;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: New state
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
public class NewState implements WorkingState {

    @Override
    public void condition() {
        log.info("\t# Device just bought. It works excellent =)");
    }
}
