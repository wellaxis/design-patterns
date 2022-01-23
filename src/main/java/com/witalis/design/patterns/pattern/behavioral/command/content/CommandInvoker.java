package com.witalis.design.patterns.pattern.behavioral.command.content;

import com.witalis.design.patterns.pattern.behavioral.command.content.command.*;
import com.witalis.design.patterns.pattern.behavioral.command.content.object.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Desc: Invoker command pattern
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
public class CommandInvoker {

    public void invoke() {
        log.info("\tCommand: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // scenario
            log.info("\t============= Scenarios:");

            log.info("");

            log.info("\t------------- Scenario[1]:");
            Computer laptop = new Laptop("Super Laptop", "It's a laptop", 100);
            DeviceOwner admin = new DeviceOwner("Administrator");
            scenario(laptop, admin, List.of("CPU", "Memory", "Motherboard"));

            log.info("");

            log.info("\t------------- Scenario[2]:");
            Computer tablet = new Tablet("Power tablet", "It's a tablet", 100);
            DeviceOwner user = new DeviceOwner("User");
            scenario(tablet, user, List.of("Network", "Printer", "Bluetooth"));

            log.info("");

            log.info("\t------------- Scenario[3]:");
            Computer mobile = new Mobile("Cheap mobile", "It's a mobile", 100);
            DeviceOwner tester = new DeviceOwner("Tester");
            scenario(mobile, tester, List.of("Antivirus", "SIM", "Wifi"));

            log.info("");

        } catch (Exception e) {
            log.error("\tCommand: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tCommand: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device, DeviceOwner owner, List<String> drivers) {
        // receiver
        log.info("\t# Device {}", device);

        // commands
        Command turnOn = new TurnOnCommand(device);
        owner.register("turnOn", turnOn);

        drivers.forEach(
            driver -> {
                InstallDriverCommand deviceDriver = new InstallDriverCommand(device);
                deviceDriver.setDriver(driver);
                owner.register(driver, deviceDriver);
            }
        );

        Command turnOff = new TurnOffCommand(device);
        owner.register("turnOff", turnOff);

        // invoker
        log.info("\t# Invoker {}", owner);
        owner.executeAll();
    }
}
