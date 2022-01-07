package com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Laptop;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Mobile;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.Tablet;

/**
 * Desc: Device visitor interface
 * User: Wellaxis
 * Date: 27.12.2021
 */
public interface DeviceVisitor {
    void visit(Laptop laptop);
    void visit(Mobile mobile);
    void visit(Tablet tablet);
}
