package com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Laptop;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Mobile;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Tablet;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Transmission visitor
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class SoftwareVisitor implements DeviceVisitor {

    @Override
    public void visit(Laptop laptop) {
        log.info("\t# Laptop software to install:");
        log.info("\t\t- All computer drivers");
        log.info("\t\t- Antivirus, browser program");
        log.info("\t\t- Programs for coding");
    }

    @Override
    public void visit(Mobile mobile) {
        log.info("\t# Mobile software to install:");
        log.info("\t\t- All mobile drivers");
        log.info("\t\t- Antivirus, cleaner programs");
        log.info("\t\t- Programs for chatting");
    }

    @Override
    public void visit(Tablet tablet) {
        log.info("\t# Tablet software to install:");
        log.info("\t\t- All tablet drivers");
        log.info("\t\t- Antivirus, audio/video programs");
        log.info("\t\t- Programs for viewing");
    }
}
