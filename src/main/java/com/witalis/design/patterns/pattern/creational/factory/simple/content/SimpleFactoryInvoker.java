package com.witalis.design.patterns.pattern.creational.factory.simple.content;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.*;

import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.coffee.CoffeeType;
import com.witalis.design.patterns.pattern.creational.factory.simple.content.object.coffee.ICoffee;
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
            // shop
            ICoffeeShop shop = new CoffeeShop();

            // coffee
            ICoffee coffee;

            log.info("");

            // the 1st cup
            coffee = shop.orderCoffee(CoffeeType.ESPRESSO);
            log.info("*** The 1st cup: {}", coffee);

            log.info("");

            // the 2nd cup
            coffee = shop.orderCoffee(CoffeeType.AMERICANO);
            log.info("*** The 2nd cup: {}", coffee);

            log.info("");

            // the 3rd cup
            coffee = shop.orderCoffee(CoffeeType.CAPPUCCINO);
            log.info("*** The 3rd cup: {}", coffee);

            log.info("");

            // the 4th cup
            coffee = shop.orderCoffee(CoffeeType.LATTE);
            log.info("*** The 4th cup: {}", coffee);

            log.info("");

        } catch (Exception e) {
            log.error("\tSimple Factory: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tSimple Factory: end, time = {} ms", (end - begin) / 1000);
    }
}
