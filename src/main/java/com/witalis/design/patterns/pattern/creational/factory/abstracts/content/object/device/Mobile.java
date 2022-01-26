package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.device;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public final class Mobile extends Computer {
    public static final String DEF_NAME = "Device -> Mobile";
    public static final String DEF_TOKEN = "API Key";
    public static final boolean DEF_BACKLIGHT = true;
    public static final double DEF_PRICE = 500.0;
    public static final int DEF_VERSION = 100;

    public Mobile() {
        this(DEF_NAME, DEF_TOKEN, DEF_BACKLIGHT, DEF_PRICE, DEF_VERSION);
    }

    public Mobile(String name, String token, boolean backlight, double price, int version) {
        super(name, token, backlight, price, version);
    }

    @Override
    public void charge() {
        log.info("\t# Wireless device charging...");
    }

    @Override
    public void check() {
        log.info("\t> Check the wifi connection...");
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }

    @Override
    public void clean() {
        log.info("\t# Blow on the phone...");
    }
}
