package com.witalis.design.patterns.pattern.creational.factory.method.content;

import com.witalis.design.patterns.pattern.creational.factory.method.content.factory.*;
import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker factory method pattern
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
public class FactoryMethodInvoker {

    public void invoke() {
        log.info("\tFactory Method: begin");
        long begin = System.nanoTime();
        try {
            // shop
            ICoffeeShop shop;

            // coffee
            ICoffee coffee;

            log.info("");

            // the 1st cup
            shop = new ClassicCoffeeShop();
            coffee = shop.orderCoffee(CoffeeType.ESPRESSO);
            log.info("*** The 1st cup: {}", coffee);

            log.info("");

            // the 2nd cup
            shop = new ExoticCoffeeShop();
            coffee = shop.orderCoffee(CoffeeType.AMERICANO);
            log.info("*** The 2nd cup: {}", coffee);

            log.info("");

            // the 3rd cup
            shop = new AlcoholicCoffeeShop();
            coffee = shop.orderCoffee(CoffeeType.CAPPUCCINO);
            log.info("*** The 3rd cup: {}", coffee);

            log.info("");

            // the 4th cup
            shop = new InstantCoffeeShop();
            coffee = shop.orderCoffee(CoffeeType.LATTE);
            log.info("*** The 4th cup: {}", coffee);

            log.info("");

        } catch (Exception e) {
            log.error("\tFactory Method: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tFactory Method: end, time = {} ms", (end - begin) / 1000);
    }
}
