package com.witalis.design.patterns.pattern.structural.proxy;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.proxy.content.ProxyInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Proxy pattern
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
@Pattern(
    name = "Proxy",
    type = Classification.STRUCTURAL
)
public class Proxy implements IPattern {

    @Override
    public void process() {
        log.info("Pattern[proxy]: process");
        var proxy = new ProxyInvoker();
        proxy.invoke();
    }
}
