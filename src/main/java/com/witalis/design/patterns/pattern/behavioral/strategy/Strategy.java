package com.witalis.design.patterns.pattern.behavioral.strategy;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.strategy.content.StrategyInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Strategy pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Pattern(
    name = "Strategy",
    type = Classification.BEHAVIORAL
)
public class Strategy implements IPattern {

    @Override
    public void process() {
        log.info("=================== Pattern[strategy]: process ==================");
        var strategy = new StrategyInvoker();
        strategy.invoke();
        log.info("=================================================================");
    }
}
