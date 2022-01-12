package com.witalis.design.patterns.pattern.structural.composite.content.object;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 12.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name);
    }

    public Mobile(String name, String comments) {
        super(name, comments);
    }

    @Override
    public void use() {
        log.info("\t{}> Call to your friends...", getName().toLowerCase());
        log.info("\t{}> Check youtube videos...", getName().toLowerCase());
    }
}
