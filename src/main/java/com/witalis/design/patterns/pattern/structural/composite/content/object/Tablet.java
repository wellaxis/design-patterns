package com.witalis.design.patterns.pattern.structural.composite.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 12.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name);
    }

    public Tablet(String name, String comments) {
        super(name, comments);
    }

    @Override
    public void use() {
        log.info("\t{}> Play online game...", getName().toLowerCase());
        log.info("\t{}> Watch a new film...", getName().toLowerCase());
    }
}
