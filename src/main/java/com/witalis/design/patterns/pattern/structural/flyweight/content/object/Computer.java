package com.witalis.design.patterns.pattern.structural.flyweight.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Computer implements Device {
    private int id;
    private String name;
    private String comments;

    protected Computer(int id, String name, String comments) {
        this.id = id;
        this.name = name;
        this.comments = comments;
    }

    protected Computer(int id, String name) {
        this(id, name, "Standard device");
    }

    protected Computer(int id) {
        this(id, "device-" + id, "Standard device");
    }
}
