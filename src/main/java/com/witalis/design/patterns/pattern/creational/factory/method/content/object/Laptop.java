package com.witalis.design.patterns.pattern.creational.factory.method.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class Laptop extends Computer {
    public static final String DEF_NAME = "Device -> Laptop";
    public static final String DEF_TOKEN = "Bearer Token";
    public static final boolean DEF_BACKLIGHT = false;
    public static final double DEF_PRICE = 50_000.0;
    public static final int DEF_VERSION = 100;

    public Laptop() {
        this(DEF_NAME, DEF_TOKEN, DEF_BACKLIGHT, DEF_PRICE, DEF_VERSION);
    }

    public Laptop(String name, String token, boolean backlight, double price, int version) {
        super(name, token, backlight, price, version);
    }

    @Override
    public void charge() {
        log.info("\t# Power unit charging...");
    }

    @Override
    public void check() {
        log.info("\t> Check BIOS & system drivers...");
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }

    @Override
    public void clean() {
        log.info("\t# Vacuum the laptop's keyboard...");
    }
}
