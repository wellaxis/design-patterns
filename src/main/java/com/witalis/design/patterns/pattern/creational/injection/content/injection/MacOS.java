package com.witalis.design.patterns.pattern.creational.injection.content.injection;

import com.witalis.design.patterns.pattern.creational.injection.content.object.Device;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Macintosh operating system
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class MacOS extends OperatingSystem {

    public MacOS(String name, String license) {
        super(name, license);
    }

    @Override
    public boolean usedBy(Device device) {
        if (getLicense() == null || getLicense().isEmpty()) {
            log.warn(
                "\t{}| Use macOS Recovery to reinstall the Mac operating system.",
                device.getClass().getSimpleName().toLowerCase()
            );
        }
        log.info(
            "\t{}| Windows operation system is loading, wait please...",
            device.getClass().getSimpleName().toLowerCase()
        );
        return true;
    }
}
