package com.witalis.design.patterns.pattern.creational.builder;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.builder.content.BuilderInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Builder pattern
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Pattern(
    name = "Builder",
    type = Classification.CREATIONAL
)
public class Builder implements IPattern {

    @Override
    public void process() {
        log.info("Pattern[builder]: process");
        var builder = new BuilderInvoker();
        builder.invoke();
    }
}
