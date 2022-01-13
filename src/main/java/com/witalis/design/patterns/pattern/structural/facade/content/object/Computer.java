package com.witalis.design.patterns.pattern.structural.facade.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private String comments;

    protected Computer() {
        this.id = UUID.randomUUID();
    }

    protected Computer(String name, String comments) {
        this();
        this.name = name;
        this.comments = comments;
    }

    protected Computer(String name) {
        this(name, "Standard device");
    }
}
