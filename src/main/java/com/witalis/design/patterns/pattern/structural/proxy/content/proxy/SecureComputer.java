package com.witalis.design.patterns.pattern.structural.proxy.content.proxy;

import com.witalis.design.patterns.pattern.structural.proxy.content.object.*;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer proxy
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
@Data
@Builder
@ToString
@EqualsAndHashCode
public class SecureComputer implements Device {
    private final Device device;
    private final String password;

    public SecureComputer(Device device, String password) {
        this.device = device;
        this.password = password;
    }

    private boolean authenticate() {
        return getPassword().equals("$ecr@t");
    }

    @Override
    public void turnOn() {
        device.turnOn();
    }

    @Override
    public void use() {
        // before
        preProcess();
        // process
        process();
        // after
        postProcess();
    }

    @Override
    public void turnOff() {
        device.turnOff();
    }

    private void preProcess() {
        log.info("\t> Proxy[device]: Initialize session.");
    }

    private void process() {
        if (authenticate()) {
            device.use();
        } else {
            log.warn("\t> Proxy[device]: authentication failed! Password is incorrect...");
        }
    }

    private void postProcess() {
        log.info("\t> Proxy[device]: Finalize session.");
    }
}
