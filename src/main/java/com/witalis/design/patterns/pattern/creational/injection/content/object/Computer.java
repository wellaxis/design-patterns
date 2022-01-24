package com.witalis.design.patterns.pattern.creational.injection.content.object;

import com.witalis.design.patterns.pattern.creational.injection.content.injection.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private Software software;

    protected Computer(String name, Software software) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.software = software;
    }

    @Override
    public void use() {
        var connection = getSoftware().usedBy(this);
        if (connection) using();
    }

    public abstract void using();

    @Override
    public String toString() {
        return "Device: [" + "id='" + id + "', " + "name='" + name + "', " + "software='" + software.getName() + "']";
    }
}
