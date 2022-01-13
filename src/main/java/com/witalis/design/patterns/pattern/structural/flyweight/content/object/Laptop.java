package com.witalis.design.patterns.pattern.structural.flyweight.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Laptop extends Computer {

    public Laptop(int id) {
        super(id);
    }

    public Laptop(int id, String name) {
        super(id, name);
    }

    public Laptop(int id, String name, String comments) {
        super(id, name, comments);
    }

    @Override
    public void use() {
        log.info("\t{}> Operation system loading...", getName().toLowerCase());
    }
}
