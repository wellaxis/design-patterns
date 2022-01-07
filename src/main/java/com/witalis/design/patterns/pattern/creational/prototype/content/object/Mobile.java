package com.witalis.design.patterns.pattern.creational.prototype.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Mobile extends Computer {
    private boolean dualSim;

    public Mobile(String name, double price, boolean active) {
        super(name, price, active);
    }

    public Mobile(Mobile target) {
        super(target);
        if (target != null) {
            this.dualSim = target.isDualSim();
        }
    }

    @Override
    public Computer propagate() {
        return new Mobile(this);
    }

    @Override
    public Computer clone() throws CloneNotSupportedException {
        Computer mobile = (Mobile) super.clone();
        mobile.setId(UUID.randomUUID());
        return mobile;
    }

    @Override
    public void use() {
        log.info("\t> Call to your friends...");
        log.info("\t> Check youtube videos...");
    }
}
