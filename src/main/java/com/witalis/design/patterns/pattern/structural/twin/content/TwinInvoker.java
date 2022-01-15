package com.witalis.design.patterns.pattern.structural.twin.content;

import com.witalis.design.patterns.pattern.structural.twin.content.object1.*;
import com.witalis.design.patterns.pattern.structural.twin.content.object1.inheritor.*;
import com.witalis.design.patterns.pattern.structural.twin.content.object2.*;
import com.witalis.design.patterns.pattern.structural.twin.content.object2.inheritor.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker twin class
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
public class TwinInvoker {

    public void invoke() {
        log.info("\tTwin: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // the 1st twin
            Webcam camera = new Webcam("GoPro Hero 10");
            // the 2nd twin
            Copter copter = new Copter("Boeing CH-47");
            // relationship
            camera.setTwin(copter);
            copter.setTwin(camera);

            // interaction
            log.info("Scenario Twin[1]: {}", camera);
            camera.charge();
            camera.use();
            camera.fly();
            camera.hoverInAir();
            camera.recordVideo();

            log.info("");

            log.info("Scenario Twin[2]: {}", copter);
            copter.refuel();
            copter.fly();
            copter.use();
            copter.hoverInAir();
            copter.recordVideo();

            log.info("");

            // inheritance from the 1st twin
            SmartDrone smartDrone = new SmartDrone("Ring Always Home Cam");
            smartDrone.setTwin(new Copter("Copter with charging dock"));
            log.info("Inherited Twin[1]: {}", smartDrone);

            // scenario
            smartDrone.charge();
            smartDrone.use();
            smartDrone.fly();
            smartDrone.hoverInAir();
            smartDrone.recordVideo();

            log.info("");

            // inheritance from the 2nd twin
            Quadcopter quadcopter = new Quadcopter("OnyxStar FOX-C8 XT");
            quadcopter.setTwin(new Webcam("Mini Drone 1080P 4K Webcam Hd"));
            log.info("Inherited Twin[2]: {}", quadcopter);

            // scenario
            quadcopter.refuel();
            quadcopter.fly();
            quadcopter.use();
            quadcopter.hoverInAir();
            quadcopter.recordVideo();

            log.info("");

        } catch (Exception e) {
            log.error("\tTwin: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tTwin: end, time = {} ms", (end - begin) / 1000);
    }
}
