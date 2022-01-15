package com.witalis.design.patterns.pattern.structural.marker.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Data
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

    @Override
    public String toString() {
        return super.toString();
    }
}
