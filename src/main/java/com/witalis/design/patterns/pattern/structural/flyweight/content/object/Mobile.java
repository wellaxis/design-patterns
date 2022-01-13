package com.witalis.design.patterns.pattern.structural.flyweight.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Mobile extends Computer {

    public Mobile(int id) {
        super(id);
    }

    public Mobile(int id, String name) {
        super(id, name);
    }

    public Mobile(int id, String name, String comments) {
        super(id, name, comments);
    }

    @Override
    public void use() {
        log.info("\t{}> Call to your friends...", getName().toLowerCase());
    }
}
