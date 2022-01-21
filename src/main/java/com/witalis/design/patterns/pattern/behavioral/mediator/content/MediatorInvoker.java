package com.witalis.design.patterns.pattern.behavioral.mediator.content;

import com.witalis.design.patterns.pattern.behavioral.mediator.content.mediator.*;
import com.witalis.design.patterns.pattern.behavioral.mediator.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker mediator pattern
 * User: Wellaxis
 * Date: 21.01.2022
 */
@Slf4j
public class MediatorInvoker {

    public void invoke() {
        log.info("\tMediator: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // devices
            log.info("\t============= Devices:");

            // laptop
            Computer laptop = new Laptop("Super Laptop", "It's a laptop", 100);
            log.info("\t# {}", laptop);
            // tablet
            Computer tablet = new Tablet("Power tablet", "It's a tablet", 100);
            log.info("\t# {}", tablet);
            // mobile
            Computer mobile = new Mobile("Cheap mobile", "It's a mobile", 100);
            log.info("\t# {}", mobile);

            log.info("");

            // mediator
            log.info("\t============= Messenger:");

            // messenger
            Messenger messenger = new Messenger("Mega Chat");
            log.info("\t# {}", messenger);

            messenger.registerDevice(laptop);
            messenger.registerDevice(tablet);
            messenger.registerDevice(mobile);

            laptop.setMediator(messenger);
            tablet.setMediator(messenger);
            mobile.setMediator(messenger);

            log.info("");

            // communication
            log.info("\t============= Chatting:");

            log.info("");

            log.info("\t------------- Scenario[1]:");
            laptop.sendMessage("Hello, it's a super fast laptop ;)");

            log.info("");

            log.info("\t------------- Scenario[2]:");
            tablet.sendMessage("Hi, it's a convenient tablet :)");

            log.info("");

            log.info("\t------------- Scenario[3]:");
            mobile.sendMessage("Hey, it's a really nimbus mobile =)");

            log.info("");

        } catch (Exception e) {
            log.error("\tMediator: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tMediator: end, time = {} ms", (end - begin) / 1000);
    }
}
