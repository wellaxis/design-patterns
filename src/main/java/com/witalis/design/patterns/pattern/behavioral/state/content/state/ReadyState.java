package com.witalis.design.patterns.pattern.behavioral.state.content.state;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Ready state
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
public class ReadyState implements WorkingState {

    @Override
    public void condition() {
        log.info("\t# Device is ready. Finally can use it!");
    }
}
