package com.witalis.design.patterns.pattern.behavioral.interpreter.content.object;

import com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter.Context;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private int version;
    private Context context;

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
