package com.witalis.design.patterns.pattern.structural.proxy.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
@Data
@Builder
@ToString
@EqualsAndHashCode
@NoArgsConstructor
@AllArgsConstructor
public class Computer implements Device {
    private UUID id;
    private String name;
    private String comments;

    @Override
    public void turnOn() {
        log.info("\t$ Computer '{}' -> turn on.", getName());
    }

    @Override
    public void use() {
        log.info("\t$ Computer '{}' -> in use...", getName());
    }

    @Override
    public void turnOff() {
        log.info("\t$ Computer '{}' -> turn off.", getName());
    }
}
