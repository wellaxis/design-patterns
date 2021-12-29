package com.witalis.design.patterns.pattern.behavioral.state;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.state.content.StateInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: State pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Pattern(
    name = "State",
    type = Classification.BEHAVIORAL
)
public class State implements IPattern {

    @Override
    public void process() {
        log.info("=================== Pattern[state]: process =====================");
        var state = new StateInvoker();
        state.invoke();
        log.info("=================================================================");
    }
}
