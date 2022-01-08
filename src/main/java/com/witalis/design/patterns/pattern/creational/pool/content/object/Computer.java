package com.witalis.design.patterns.pattern.creational.pool.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class Computer implements Device {
    private UUID id;
    private String name;
    private boolean active;

    public Computer() {
        this.id = UUID.randomUUID();
        this.active = true;
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}
