package com.witalis.design.patterns.pattern.structural.decorator.content.object;

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
}
