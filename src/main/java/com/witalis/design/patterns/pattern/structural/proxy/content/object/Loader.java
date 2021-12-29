package com.witalis.design.patterns.pattern.structural.proxy.content.object;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Loader class
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
public class Loader implements Loadable {

    @Override
    public void load() {
        log.info("\tLoader: load data...");
    }
}
