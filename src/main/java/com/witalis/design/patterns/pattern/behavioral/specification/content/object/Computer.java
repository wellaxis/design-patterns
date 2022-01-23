package com.witalis.design.patterns.pattern.behavioral.specification.content.object;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private DeviceType type;
    private DeviceSize size;
    private DevicePrice price;
    private DeviceCpu cpu;

    protected Computer(
        String name,
        DeviceType type,
        DeviceSize size,
        DevicePrice price,
        DeviceCpu cpu
    ) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.type = type;
        this.size = size;
        this.price = price;
        this.cpu = cpu;
    }

    @Override
    public String toString() {
        return "Device: [" +
            "id=" + id + ", " +
            "name='" + name + "', " +
            "type=" + type + ", " +
            "size=" + size + ", " +
            "price=" + price + ", " +
            "cpu=" + cpu +
            "]";
    }
}
