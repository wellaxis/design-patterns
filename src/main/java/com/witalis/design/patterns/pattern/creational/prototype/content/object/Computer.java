package com.witalis.design.patterns.pattern.creational.prototype.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Computer implements Device, Cloneable {
    private UUID id;
    private String name;
    private double price;
    private boolean active;

    protected Computer(String name, double price, boolean active) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.price = price;
        this.active = active;
    }

    protected Computer(Computer target) {
        if (target != null) {
            this.id = UUID.randomUUID();
            this.name = target.getName();
            this.price = target.getPrice();
            this.active = target.isActive();
        }
    }

    // compliant
    public abstract Computer propagate();

    // non-compliant
    public Computer clone() throws CloneNotSupportedException {
        return (Computer) super.clone();
    }
}
