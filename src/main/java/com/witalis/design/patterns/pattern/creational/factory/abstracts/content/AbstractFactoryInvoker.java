package com.witalis.design.patterns.pattern.creational.factory.abstracts.content;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea.*;

import lombok.extern.slf4j.Slf4j;

import java.text.NumberFormat;

/**
 * Desc: Invoker abstract factory pattern
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
public class AbstractFactoryInvoker {

    public void invoke() {
        log.info("\tAbstract Factory: begin");
        long begin = System.nanoTime();
        try {
            // cafe
            ICafe cafe;

            // coffee
            Coffee coffee;
            // tea
            Tea tea;

            log.info("");

            // the 1st cafe
            invoke(
                CafeStyle.CLASSIC,
                CoffeeType.AMERICANO,
                TeaType.BLACK
            );

            log.info("");

            // the 2nd cafe
            invoke(
                CafeStyle.EXOTIC,
                CoffeeType.ESPRESSO,
                TeaType.WHITE
            );

            log.info("");

            // the 3rd cafe
            invoke(
                CafeStyle.ALCOHOLIC,
                CoffeeType.LATTE,
                TeaType.GREEN
            );

            log.info("");

            // the 4th cafe
            invoke(
                CafeStyle.INSTANT,
                CoffeeType.CAPPUCCINO,
                TeaType.PURPLE
            );

            log.info("");

        } catch (Exception e) {
            log.error("\tAbstract Factory: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tAbstract Factory: end, time = {} ms", (end - begin) / 1000);
    }

    private void invoke(CafeStyle cafeStyle, CoffeeType coffeeType, TeaType teaType) {
        var style = cafeStyle.name().toLowerCase();

        log.info("*** The {} cafe", style);
        Cafe cafe = Cafe.create(cafeStyle);

        log.info("=== Order coffee...");
        Coffee coffee = cafe.orderCoffee(coffeeType);

        log.info("=== Order tea...");
        Tea tea = cafe.orderTea(teaType);

        log.info("--- The cup of coffee: {}", coffee);
        log.info("--- The cup of tea: {}", tea);

        var currency = NumberFormat.getCurrencyInstance();
        log.info(
            "$$$ Total price in {} cafe = {} $$$",
            style,
            currency.format(coffee.getPrice() + tea.getPrice())
        );
    }
}
