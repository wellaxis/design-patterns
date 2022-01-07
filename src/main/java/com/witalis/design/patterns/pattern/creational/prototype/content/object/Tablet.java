package com.witalis.design.patterns.pattern.creational.prototype.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Tablet extends Computer {
    private double diagonal;

    public Tablet(String name, double price, boolean active) {
        super(name, price, active);
    }

    public Tablet(Tablet target) {
        super(target);
        if (target != null) {
            this.diagonal = target.getDiagonal();
        }
    }

    @Override
    public Computer propagate() {
        return new Tablet(this);
    }

    @Override
    public Computer clone() throws CloneNotSupportedException {
        Computer tablet = (Tablet) super.clone();
        tablet.setId(UUID.randomUUID());
        return tablet;
    }

    @Override
    public void use() {
        log.info("\t> Play online game...");
        log.info("\t> Watch a new film...");
    }
}