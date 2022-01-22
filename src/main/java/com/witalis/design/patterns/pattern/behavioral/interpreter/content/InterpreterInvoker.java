package com.witalis.design.patterns.pattern.behavioral.interpreter.content;

import com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter.*;
import com.witalis.design.patterns.pattern.behavioral.interpreter.content.object.*;

import lombok.extern.slf4j.Slf4j;
import java.util.List;

/**
 * Desc: Invoker interpreter pattern
 * User: Wellaxis
 * Date: 22.02.2022
 */
@Slf4j
public class InterpreterInvoker {

    public void invoke() {
        log.info("\tInterpreter: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // context

            Context professional = new Context(
                "Professional",
                List.of("Secure", "Powerful", "Workstation", "#client", "#server")
            );
            Context gaming = new Context(
                "Gaming",
                List.of("Expensive", "Modern", "Fast", "#super", "#power")
            );
            Context economy = new Context(
                "Economy",
                List.of("Economy", "Budget", "Slow", "#cheap", "#reason")
            );

            // devices

            // laptop
            Computer laptop = new Laptop("Super laptop", 100);
            laptop.setContext(professional);
            scenario(laptop, ExpressionUtils.initWorkExpression());

            log.info("");

            // tablet
            Computer tablet = new Tablet("Power tablet", 100);
            tablet.setContext(gaming);
            scenario(tablet, ExpressionUtils.initGameExpression());

            log.info("");

            // mobile
            Computer mobile = new Mobile("Cheap mobile", 100);
            mobile.setContext(economy);
            scenario(mobile, ExpressionUtils.initHomeExpression());

            log.info("");

        } catch (Exception e) {
            log.error("\tInterpreter: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tInterpreter: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device, Expression expression) {
        if (device == null || device.getContext() == null) return;

        log.info("\t> Device => {}", device);
        log.info("\t> Context => {}", device.getContext());
        log.info("\t> Expression => {}", expression);
        log.info("\t# Compatibility => {}", expression.interpret(device.getContext()));
    }
}
