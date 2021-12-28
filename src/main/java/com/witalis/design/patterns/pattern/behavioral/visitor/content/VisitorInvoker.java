package com.witalis.design.patterns.pattern.behavioral.visitor.content;

import com.witalis.design.patterns.pattern.behavioral.visitor.content.object.*;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.CarVisitor;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.CruiseControlVisitor;
import com.witalis.design.patterns.pattern.behavioral.visitor.content.visitor.TransmissionVisitor;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker visitor pattern
 * User: Wellaxis
 * Date: 27.12.2021
 */
@Slf4j
public class VisitorInvoker {

    public void invoke() {
        log.info("\tVisitor: begin");
        long begin = System.nanoTime();
        try {
            // car
            Car audi = new Audi();
            Car bmw = new Bmw();
            Car mercedes = new Mercedes();
            Car volkswagen = new Volkswagen();

            // visitor
            CarVisitor cruiseControl = new CruiseControlVisitor();
            CarVisitor transmission = new TransmissionVisitor();

            log.info("");

            // audi
            audi.drive();
            audi.accept(cruiseControl);
            audi.accept(transmission);

            log.info("");

            // bmw
            bmw.drive();
            bmw.accept(cruiseControl);
            bmw.accept(transmission);

            log.info("");

            // mercedes
            mercedes.drive();
            mercedes.accept(cruiseControl);
            mercedes.accept(transmission);

            log.info("");

            // volkswagen
            volkswagen.drive();
            volkswagen.accept(cruiseControl);
            volkswagen.accept(transmission);

            log.info("");
        } catch (Exception e) {
            log.error("\tVisitor: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tVisitor: end, time = {} ms", (end - begin) / 1000);
    }
}
