package com.witalis.design.patterns.pattern.structural.adapter.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 28.12.2021
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
}
