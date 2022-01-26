package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.device;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class Tablet extends Computer {
    public static final String DEF_NAME = "Device -> Tablet";
    public static final String DEF_TOKEN = "Basic Auth";
    public static final boolean DEF_BACKLIGHT = true;
    public static final double DEF_PRICE = 5_000.0;
    public static final int DEF_VERSION = 100;

    public Tablet() {
        this(DEF_NAME, DEF_TOKEN, DEF_BACKLIGHT, DEF_PRICE, DEF_VERSION);
    }

    public Tablet(String name, String token, boolean backlight, double price, int version) {
        super(name, token, backlight, price, version);
    }

    @Override
    public void charge() {
        log.info("\t# Universal Serial Bus charging...");
    }

    @Override
    public void check() {
        log.info("\t> Check system with anti-virus software...");
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }

    @Override
    public void clean() {
        log.info("\t# Wipe with a damp cloth...");
    }
}
