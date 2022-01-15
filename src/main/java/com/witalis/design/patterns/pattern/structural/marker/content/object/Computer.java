package com.witalis.design.patterns.pattern.structural.marker.content.object;

import com.witalis.design.patterns.pattern.structural.marker.content.marker.Printable;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Data
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Computer implements Device {
    private int id;
    private String name;
    private String comments;

    protected Computer(int id, String name, String comments) {
        this.id = id;
        this.name = name;
        this.comments = comments;
    }

    protected Computer(int id, String name) {
        this(id, name, "Standard device");
    }

    protected Computer(int id) {
        this(id, "device-" + id, "Standard device");
    }

    @Override
    public String toString() {
        if (this instanceof Printable) {
            return "Computer: [id=" + id + ", name='" + name + "', comments='" + comments + "']";
        } else {
            return "Computer: [-- not printable information --]";
        }
    }
}
