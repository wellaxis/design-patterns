package com.witalis.design.patterns.pattern.behavioral.blackboard.content;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard.*;

import lombok.extern.slf4j.Slf4j;

import java.util.*;

/**
 * Desc: Invoker blackboard pattern
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class BlackboardInvoker {

    public void invoke() {
        log.info("\tBlackboard: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // workshop => blackboard

            ComputerWorkshop workshop = new ComputerWorkshop("Success Repairing");

            // manager => control

            ComputerManager manager = new ComputerManager("Alex");
            workshop.setManager(manager);

            log.info("");

            // masters => knowledge sources

            SecretaryMaster secretary = new SecretaryMaster("Alina", Collections.emptyList(), workshop);
            ComputerMaster newbie = new ComputerMaster("Sam", List.of(DeviceType.MOBILE), workshop);
            ComputerMaster skilled = new ComputerMaster("Tom", List.of(DeviceType.MOBILE, DeviceType.TABLET), workshop);
            ComputerMaster expert = new ComputerMaster("Bob", Arrays.asList(DeviceType.values()), workshop);

            // office
            manager.setSecretary(secretary);
            manager.hireMaster(newbie);
            manager.hireMaster(skilled);
            manager.hireMaster(expert);

            // devices => objects

            Computer notebook = new Laptop("Just bought");
            Computer mobile = new Mobile("Cheap mobile");
            mobile.setStatus(DeviceStatus.BROKEN);
            Computer tablet = new Tablet("Power tablet");
            tablet.setStatus(DeviceStatus.BROKEN);
            Computer laptop = new Laptop("Super laptop");
            laptop.setStatus(DeviceStatus.BROKEN);

            log.info("");

            // scenarios

            scenario(notebook, workshop);

            log.info("");

            scenario(mobile, workshop);

            log.info("");

            scenario(tablet, workshop);

            log.info("");

            scenario(laptop, workshop);

            log.info("");

            manager.fireMaster(expert);
            laptop.setStatus(DeviceStatus.BROKEN);
            scenario(laptop, workshop);

            log.info("");

        } catch (Exception e) {
            log.error("\tBlackboard: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tBlackboard: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device, Workshop workshop) {
        if (device == null || workshop == null) return;

        log.info("\t=========== Scenario:");

        log.info("\t----------- {}", workshop);
        log.info("\t----------- {}", device);

        log.info("");

        workshop.acceptDevice(device);

        log.info("");

        log.info("\t=========== Done.");
    }
}
