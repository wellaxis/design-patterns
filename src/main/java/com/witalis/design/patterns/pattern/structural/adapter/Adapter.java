package com.witalis.design.patterns.pattern.structural.adapter;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.adapter.content.AdapterInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Adapter pattern
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Pattern(
    name = "Adapter",
    type = Classification.STRUCTURAL
)
public class Adapter implements IPattern {

    @Override
    public void process() {
        log.info("=================== Pattern[adapter]: process ===================");
        var adapter = new AdapterInvoker();
        adapter.invoke();
        log.info("=================================================================");
    }
}
