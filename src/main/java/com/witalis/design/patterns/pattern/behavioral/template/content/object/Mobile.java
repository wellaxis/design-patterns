package com.witalis.design.patterns.pattern.behavioral.template.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 19.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name);
    }

    public Mobile(String name, String comments) {
        super(name, comments);
    }

    @Override
    protected void charge() {
        log.info("\t> Wireless device charging...");
    }

    @Override
    protected void turnOn() {
        log.info("\t> Scan the fingerprint...");
    }

    @Override
    protected void handle() {
        log.info("\t> Call to your friends.. Check youtube videos...");
    }

    @Override
    protected void turnOff() {
        log.info("\t> Activate smartphone lock...");
    }

    @Override
    protected void clean() {
        log.info("\t> Blow on the phone...");
    }
}
