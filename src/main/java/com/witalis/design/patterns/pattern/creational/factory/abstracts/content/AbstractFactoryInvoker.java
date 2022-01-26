package com.witalis.design.patterns.pattern.creational.factory.abstracts.content;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.device.*;

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

            log.info("");

            // the 1st order
            scenario(
                ShopRank.WORK,
                "Business Ltd",
                DeviceType.LAPTOP,
                CoffeeType.AMERICANO
            );

            log.info("");

            // the 2nd order
            scenario(
                ShopRank.HOME,
                "Alone Market",
                DeviceType.MOBILE,
                CoffeeType.CAPPUCCINO
            );

            log.info("");

            // the 3rd order
            scenario(
                ShopRank.GAME,
                "A Lux Choice",
                DeviceType.TABLET,
                CoffeeType.LATTE
            );

            log.info("");

        } catch (Exception e) {
            log.error("\tAbstract Factory: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tAbstract Factory: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(ShopRank shopRank, String shopName, DeviceType deviceType, CoffeeType coffeeType) {
        final var delimiter = "\t=======================================================";
        final var currency = NumberFormat.getCurrencyInstance();
        final var rank = shopRank.name().toLowerCase();

        log.info(delimiter);
        log.info("\t=============== The '{}' shop ===============", shopName);
        log.info(delimiter);

        Shop shop = ShopUtils.create(shopRank, shopName);

        log.info("\t=== Order[1]: {} device...", deviceType.name().toLowerCase());
        Device device = shop.orderDevice(deviceType);
        log.info("\t--- The device box: {}", device);
        var devicePrice = ((Computer) device).getPrice();

        log.info("");

        log.info("\t=== Order[2]: {} coffee...", coffeeType.name().toLowerCase());
        Coffee coffee = shop.orderCoffee(coffeeType);
        log.info("\t--- The coffee cup: {}", coffee);
        var coffeePrice = ((BaseCoffee) coffee).getPrice();

        log.info(delimiter);
        log.info(
            "\t$$$ Total price in {} shop = {} $$$",
            rank,
            currency.format(devicePrice + coffeePrice)
        );
        log.info(delimiter);
    }
}
