package com.witalis.design.patterns.pattern.creational.factory.content;

import com.witalis.design.patterns.pattern.creational.factory.content.factory.CoffeeFactory;
import com.witalis.design.patterns.pattern.creational.factory.content.object.CoffeeType;
import com.witalis.design.patterns.pattern.creational.factory.content.object.ICoffee;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker simple factory pattern
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
public class SimpleFactoryInvoker {

    public void invoke() {
        log.info("\tSimple Factory: begin");
        long begin = System.nanoTime();
        try {
            // coffee
            ICoffee coffee;

            log.info("");

            // the 1st cup
            coffee = CoffeeFactory.produce(CoffeeType.ESPRESSO);
            log.info("*** The 1st cup: {}", coffee);
            coffee.grind();
            coffee.milk();
            coffee.make();
            coffee.pour();

            log.info("");

            // the 2nd cup
            coffee = CoffeeFactory.produce(CoffeeType.AMERICANO);
            log.info("*** The 2nd cup: {}", coffee);
            coffee.grind();
            coffee.milk();
            coffee.make();
            coffee.pour();

            log.info("");

            // the 3rd cup
            coffee = CoffeeFactory.produce(CoffeeType.CAPPUCCINO);
            log.info("*** The 3rd cup: {}", coffee);
            coffee.grind();
            coffee.milk();
            coffee.make();
            coffee.pour();

            log.info("");

            // the 4th cup
            coffee = CoffeeFactory.produce(CoffeeType.LATTE);
            log.info("*** The 4th cup: {}", coffee);
            coffee.grind();
            coffee.milk();
            coffee.make();
            coffee.pour();

            log.info("");

        } catch (Exception e) {
            log.error("\tSimple Factory: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tSimple Factory: end, time = {} ms", (end - begin) / 1000);
    }
}
