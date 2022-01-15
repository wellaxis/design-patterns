package com.witalis.design.patterns.pattern.structural.marker.content.object;

import com.witalis.design.patterns.pattern.structural.marker.content.marker.Printable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Tablet extends Computer implements Printable {

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
        log.info("\t{}> Watch youtube channel...", getName().toLowerCase());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
