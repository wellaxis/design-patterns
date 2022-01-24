package com.witalis.design.patterns.pattern.behavioral.servant.content;

import com.witalis.design.patterns.pattern.behavioral.servant.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.servant.content.servant.*;

import lombok.extern.slf4j.Slf4j;

import java.util.Map;

/**
 * Desc: Invoker servant pattern
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class ServantInvoker {

    public void invoke() {
        log.info("\tServant: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // devices

            Computer laptop = new Laptop("Super laptop");
            Computer tablet = new Tablet("Power tablet");
            Computer mobile = new Mobile("Cheap mobile");

            // sessions

            Session secure = new SafeSession();
            Session social = new OpenSession();

            // scenarios

            scenario(laptop, secure, Map.of("force", false, "token", "DB36BG7N9D"));

            log.info("");

            scenario(tablet, social, Map.of("force", true));

            log.info("");

            scenario(mobile, secure, Map.of("force", true, "token", ""));

            log.info("");

            scenario(mobile, social, Map.of("token", "SB5EG560D4"));

            log.info("");

        } catch (Exception e) {
            log.error("\tServant: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tServant: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device, Session session, Map<String, Object> params) {
        if (device == null || session == null) return;

        boolean force = (boolean) params.getOrDefault("false", false);
        String token = (String) params.get("token");

        log.info("\t=========== Scenario:");

        log.info("\t----------- {}", device);
        log.info("\t----------- {}", session);

        log.info("");

        session.prepare(device, force);
        session.process(device, token);
        session.complete(device, force);

        log.info("");

        log.info("\t=========== Done.");
    }
}
