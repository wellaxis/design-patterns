package com.witalis.design.patterns.pattern.behavioral.visitor;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.VisitorInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Visitor pattern
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
@Pattern(
    name = "Visitor",
    type = Classification.BEHAVIORAL
)
public class Visitor implements IPattern {

    @Override
    public void process() {
        log.info("=================== Pattern[visitor]: process ===================");
        var visitor = new VisitorInvoker();
        visitor.invoke();
        log.info("=================================================================");
    }
}
