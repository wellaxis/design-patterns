package com.witalis.design.patterns.pattern.creational.factory.method.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
@Data
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private String token;
    private boolean backlight;
    private double price;
    private int version;

    protected Computer(String name, String token, boolean backlight, double price, int version) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.token = token;
        this.backlight = backlight;
        this.price = price;
        this.version = version;
    }

    @Override
    public void turnOn() {
        log.info("\t[+] Turn on device...");
    }

    @Override
    public void turnOff() {
        log.info("\t[-] Turn off device...");
    }

    @Override
    public String toString() {
        return "Device: [" +
            "id='" + id + "', " +
            "name='" + name + "', " +
            "token='" + token + "', " +
            "backlight=" + backlight + ", " +
            "price=" + price + ", " +
            "version='" + version +
            "']";
    }
}
