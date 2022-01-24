package com.witalis.design.patterns.pattern.creational.injection.content.injection;

import com.witalis.design.patterns.pattern.creational.injection.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Windows operating system
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
public class WindowsOS extends OperatingSystem {

    public WindowsOS(String name, String license) {
        super(name, license);
    }

    @Override
    public boolean usedBy(Device device) {
        if (getLicense() == null || getLicense().isEmpty()) {
            log.info(
                "\t{}| Error (0xC004F213): Windows reported that no product key was found on your device.",
                device.getClass().getSimpleName().toLowerCase()
            );
            return false;
        } else {
            log.info(
                "\t{}| Windows operation system is loading, wait please...",
                device.getClass().getSimpleName().toLowerCase()
            );
            return true;
        }
    }
}
