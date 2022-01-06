package com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Audi;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Bmw;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Mercedes;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Volkswagen;

/**
 * Desc: Car visitor interface
 * User: Wellaxis
 * Date: 27.12.2021
 */
public interface CarVisitor {
    void visit(Audi audi);
    void visit(Bmw bmw);
    void visit(Mercedes mercedes);
    void visit(Volkswagen volkswagen);
}
