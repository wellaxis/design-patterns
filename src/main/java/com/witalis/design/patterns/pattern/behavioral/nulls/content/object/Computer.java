package com.witalis.design.patterns.pattern.behavioral.nulls.content.object;

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
    private String comments;
    private int version;

    protected Computer(String name, String comments, int version) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.comments = comments;
        this.version = version;
    }

    @Override
    public String name() {
        return getName();
    }

    @Override
    public String toString() {
        return "Device: [" + "id='" + id + "', " + "name='" + name + "', " + "comments='" + comments + "', " + "version='" + version + ']';
    }
}
