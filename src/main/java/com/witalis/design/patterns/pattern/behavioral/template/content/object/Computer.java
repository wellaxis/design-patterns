package com.witalis.design.patterns.pattern.behavioral.template.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 19.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private String comments;

    protected Computer(String name, String comments) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.comments = comments;
    }

    protected Computer(String name) {
        this(name, "Standard device");
    }

    protected abstract void charge();

    protected abstract void turnOn();

    protected abstract void handle();

    protected abstract void turnOff();

    protected abstract void clean();

    /**
     * The skeleton of template method.
     */
    @Override
    public final void use() {
        log.info("\t# Take the device...");
        charge();
        turnOn();
        handle();
        turnOff();
        clean();
        log.info("\t# Fold the device...");
    }
}
