package com.witalis.design.patterns.pattern.structural.flyweight.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Tablet extends Computer {

    public Tablet(int id) {
        super(id);
    }

    public Tablet(int id, String name) {
        super(id, name);
    }

    public Tablet(int id, String name, String comments) {
        super(id, name, comments);
    }

    @Override
    public void use() {
        log.info("\t{}> Play online game...", getName().toLowerCase());
    }
}
