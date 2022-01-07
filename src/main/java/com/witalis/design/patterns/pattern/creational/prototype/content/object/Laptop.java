package com.witalis.design.patterns.pattern.creational.prototype.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Laptop device
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Laptop extends Computer {
    private int cpu;

    public Laptop(String name, double price, boolean active) {
        super(name, price, active);
    }

    public Laptop(Laptop target) {
        super(target);
        if (target != null) {
            this.cpu = target.getCpu();
        }
    }

    @Override
    public Computer propagate() {
        return new Laptop(this);
    }

    @Override
    public Computer clone() throws CloneNotSupportedException {
        Computer laptop = (Laptop) super.clone();
        laptop.setId(UUID.randomUUID());
        return laptop;
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> Develop computer program...");
    }
}