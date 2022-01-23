package com.witalis.design.patterns.pattern.behavioral.chain.content.object;

import com.witalis.design.patterns.pattern.behavioral.chain.content.chain.SoftwareInstaller;

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
    private int version;
    private SoftwareInstaller installer;

    protected Computer(String name, int version) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.version = version;
    }

    @Override
    public String toString() {
        return "Device: [" + "id='" + id + "', " + "name='" + name + "', " + "version='" + version + ']';
    }
}
