package com.witalis.design.patterns.pattern.structural.proxy.content.proxy;

import com.witalis.design.patterns.pattern.structural.proxy.content.object.Loadable;
import com.witalis.design.patterns.pattern.structural.proxy.content.object.Loader;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Loader proxy
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
public class LoaderProxy implements Loadable {
    private Loader loader;

    @Override
    public void load() {
        // before
        preLoad();
        // upload
        if (loader == null) {
            loader = new Loader();
        }
        loader.load();
        // after
        postLoad();
    }

    public void preLoad() {
        log.info("\tProxyLoader: init session...");
    }

    public void postLoad() {
        log.info("\tProxyLoader: commit data...");
    }
}
