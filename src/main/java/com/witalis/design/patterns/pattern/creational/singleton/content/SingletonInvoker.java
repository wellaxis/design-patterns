package com.witalis.design.patterns.pattern.creational.singleton.content;

import com.witalis.design.patterns.pattern.creational.singleton.content.object.Loadable;
import com.witalis.design.patterns.pattern.creational.singleton.content.singleton.LoaderProxy;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker proxy class
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
public class SingletonInvoker {

    public void invoke() {
        log.info("\tProxy: begin");
        long begin = System.nanoTime();
        try {
            Loadable loader = new LoaderProxy();
            loader.load();
        } catch (Exception e) {
            log.error("\tProxy: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tProxy: end, time = {} ms", (end - begin) / 1000);
    }
}
