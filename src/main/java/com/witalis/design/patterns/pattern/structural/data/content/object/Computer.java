package com.witalis.design.patterns.pattern.structural.data.content.object;

import com.witalis.design.patterns.pattern.structural.data.content.data.DeviceData;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.text.DecimalFormat;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Getter
public abstract class Computer implements Device {
    private final DeviceData data;

    protected Computer(String name, String comments, double price, int version, boolean active) {
        this.data = new DeviceData(name, comments, price, version, active);
    }

    public void statistics() {
        DecimalFormat df = new DecimalFormat("#.00");

        log.info("\t======= Statistics =======");
        log.info("\t=> name: {}", getData().getName());
        log.info("\t=> comments: {}", getData().getComments());
        log.info("\t=> price: {}", df.format(getData().getPrice()));
        log.info("\t=> version: {}", getData().getVersion());
        log.info("\t=> active: {}", getData().isActive());
        log.info("\t==========================");
    }
}
