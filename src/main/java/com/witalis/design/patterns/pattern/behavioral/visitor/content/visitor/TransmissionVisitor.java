package com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Audi;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Bmw;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Mercedes;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Volkswagen;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Transmission visitor
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class TransmissionVisitor implements CarVisitor {

    @Override
    public void visit(Audi audi) {
        log.info("{} has a manual transmission.", Audi.class.getSimpleName());
    }

    @Override
    public void visit(Bmw bmw) {
        log.info("{} has an automatic transmission.", Bmw.class.getSimpleName());
    }

    @Override
    public void visit(Mercedes mercedes) {
        log.info("{} has a robotic transmission.", Mercedes.class.getSimpleName());
    }

    @Override
    public void visit(Volkswagen volkswagen) {
        log.info("{} has a variator transmission (CVT).", Volkswagen.class.getSimpleName());
    }
}
