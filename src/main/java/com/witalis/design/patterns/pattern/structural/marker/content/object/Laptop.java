package com.witalis.design.patterns.pattern.structural.marker.content.object;

import com.witalis.design.patterns.pattern.structural.marker.content.marker.Printable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Laptop extends Computer implements Printable {

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

    @Override
    public String toString() {
        return super.toString();
    }
}
