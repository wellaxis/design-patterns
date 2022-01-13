package com.witalis.design.patterns.pattern.structural.facade.content.object;

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

    public Laptop(String name) {
        super(name);
    }

    public Laptop(String name, String comments) {
        super(name, comments);
    }

    public void loadSystem() {
        log.info("\tLaptop[{}]> Operation system loading...", getId());
    }

    public void defineSettings() {
        log.info("\tLaptop[{}]> Define computer settings...", getId());
    }

    public void powerOff() {
        log.info("\tLaptop[{}]> Power off computer...", getId());
    }
}
