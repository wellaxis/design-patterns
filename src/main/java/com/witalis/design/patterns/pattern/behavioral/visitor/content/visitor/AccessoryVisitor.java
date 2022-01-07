package com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Laptop;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Mobile;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Tablet;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Cruise control visitor
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class AccessoryVisitor implements DeviceVisitor {

    @Override
    public void visit(Laptop laptop) {
        log.info("\t# Laptop accessory list:");
        log.info("\t\t- Webcam, USB adapters");
        log.info("\t\t- Wireless keyboard & mouse");
        log.info("\t\t- Lap desk for laptop");
        log.info("\t\t- Laptop messenger bag");
    }

    @Override
    public void visit(Mobile mobile) {
        log.info("\t# Mobile accessory list:");
        log.info("\t\t- Mobile phone cover with cool print");
        log.info("\t\t- Portable mobile charger");
        log.info("\t\t- Power headphones, epic Audio");
        log.info("\t\t- Running armband to hold");
    }

    @Override
    public void visit(Tablet tablet) {
        log.info("\t# Tablet accessory list:");
        log.info("\t\t- USB Hub with many ports");
        log.info("\t\t- Portable tablet stand");
        log.info("\t\t- Anti-theft backpack");
        log.info("\t\t- Flesh drive for files");
    }
}
