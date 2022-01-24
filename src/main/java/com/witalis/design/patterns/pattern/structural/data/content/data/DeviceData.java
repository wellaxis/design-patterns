package com.witalis.design.patterns.pattern.structural.data.content.data;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Device data
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Getter
public class DeviceData {
    private final UUID id;
    private final String name;
    private final String comments;
    private final double price;
    private final int version;
    private final boolean active;

    public DeviceData(String name, String comments, double price, int version, boolean active) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.comments = comments;
        this.price = price;
        this.version = version;
        this.active = active;
    }
}
