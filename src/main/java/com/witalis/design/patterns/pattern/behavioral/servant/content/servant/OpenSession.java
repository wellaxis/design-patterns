package com.witalis.design.patterns.pattern.behavioral.servant.content.servant;

import com.witalis.design.patterns.pattern.behavioral.servant.content.object.Device;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Open session
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class OpenSession extends BaseSession {

    public OpenSession() {
        super();
    }

    @Override
    public void process(Device device, String token) {
        if (token == null || token.isEmpty()) {
            log.warn("\t# Warning, session is not authorized, be careful...");
        }
        log.info("\t# Session [status -> unauthorized]: processing...");
        device.check();
        device.use();
    }
}
