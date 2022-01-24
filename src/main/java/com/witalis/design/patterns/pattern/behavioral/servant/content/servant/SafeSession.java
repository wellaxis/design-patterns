package com.witalis.design.patterns.pattern.behavioral.servant.content.servant;

import com.witalis.design.patterns.pattern.behavioral.servant.content.object.Device;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Safe session
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class SafeSession extends BaseSession {

    public SafeSession() {
        super();
    }

    @Override
    public void process(Device device, String token) {
        if (token == null || token.isEmpty()) {
            log.warn("\t# Sorry, session is not authorized, finalization...");
            return;
        }
        log.info("\t# Session [status -> authorized]: processing...");
        device.check();
        device.use();
    }
}
