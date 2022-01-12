package com.witalis.design.patterns.pattern.structural.composite.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 12.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Laptop extends Computer {

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, String comments) {
        super(name, comments);
    }

    @Override
    public void use() {
        log.info("\t{}> Operation system loading...", getName().toLowerCase());
        log.info("\t{}> Define computer settings...", getName().toLowerCase());
    }
}
