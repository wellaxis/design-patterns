package com.witalis.design.patterns.pattern.creational.injection.content.injection;

import com.witalis.design.patterns.pattern.creational.injection.content.object.Device;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Ubuntu operating system
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class UbuntuOS extends OperatingSystem {

    public UbuntuOS(String name, String license) {
        super(name, license);
    }

    @Override
    public boolean usedBy(Device device) {
        if (getLicense() == null || getLicense().isEmpty()) {
            log.warn(
                "\t{}| Ubuntu doesn't need a license key, it is completely free to use.",
                device.getClass().getSimpleName().toLowerCase()
            );
        }
        log.info(
            "\t{}| Ubuntu operation system is loading, wait please...",
            device.getClass().getSimpleName().toLowerCase()
        );
        return true;
    }
}
