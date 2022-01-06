package com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Audi;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Bmw;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Mercedes;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Volkswagen;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Cruise control visitor
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class CruiseControlVisitor implements CarVisitor {

    @Override
    public void visit(Audi audi) {
        log.info("{} has an adaptive cruise control.", Audi.class.getSimpleName());
    }

    @Override
    public void visit(Bmw bmw) {
        log.info("{} has an auto-drive cruise system.", Audi.class.getSimpleName());
    }

    @Override
    public void visit(Mercedes mercedes) {
        log.info("{} has a passive cruise control.", Audi.class.getSimpleName());
    }

    @Override
    public void visit(Volkswagen volkswagen) {
        log.info("{} hasn't a cruise control at all.", Audi.class.getSimpleName());
    }
}
