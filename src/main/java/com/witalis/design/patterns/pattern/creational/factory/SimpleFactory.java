package com.witalis.design.patterns.pattern.creational.factory;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.content.SimpleFactoryInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Simple factory pattern
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
@Pattern(
    name = "Simple Factory",
    type = Classification.CREATIONAL
)
public class SimpleFactory implements IPattern {

    @Override
    public void process() {
        log.info("Pattern[factory]: process");
        var factory = new SimpleFactoryInvoker();
        factory.invoke();
    }
}
