package com.witalis.design.patterns.pattern.creational.factory.content.object;

/**
 * Desc: Coffee factory class
 * User: Wellaxis
 * Date: 28.12.2021
 */
public class CoffeeFactory {

    public static ICoffee produce(CoffeeType type) {
        return switch (type) {
            case ESPRESSO -> new Espresso(
                "Espresso coffee",
                false,
                2.5,
                "A coffee-brewing method of Italian origin, in which a small amount of nearly boiling water is forced under 9–10 bars of pressure (expressed) through finely-ground coffee beans."
            );
            case AMERICANO -> new Americano(
                "Americano coffee",
                false,
                3.0,
                "A type of coffee drink prepared by diluting an espresso with hot water, giving it a similar strength to, but different flavor from, traditionally brewed coffee."
            );
            case CAPPUCCINO -> new Cappuccino(
                "Cappuccino coffee",
                true,
                5.5,
                "An espresso-based coffee drink that originated in Austria with later development taking place in Italy, and is prepared with steamed milk foam (micro-foam)."
            );
            case LATTE -> new Latte(
                "Latte coffee",
                true,
                7.0,
                "A coffee drink of Italian origin made with espresso and steamed milk. The term comes from the Italian caffellatte, literally 'coffee and milk'."
            );
        };
    }
}
