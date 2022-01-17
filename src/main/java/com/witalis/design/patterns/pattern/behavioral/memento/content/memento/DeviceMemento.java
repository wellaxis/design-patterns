package com.witalis.design.patterns.pattern.behavioral.memento.content.memento;

import com.witalis.design.patterns.pattern.behavioral.memento.content.object.DeviceType;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Memento device class
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class DeviceMemento {
    private final DeviceType type;
    private final String name;
    private final String comments;
    private final double price;
    private final int version;
    private final boolean active;
}
