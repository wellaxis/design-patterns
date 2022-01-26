package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Coffee abstract class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Data
@EqualsAndHashCode
@NoArgsConstructor
public abstract class BaseCoffee implements Coffee {
    private String name;
    private boolean milk;
    private double price;
    private String notes;

    protected BaseCoffee(String name, boolean milk, double price, String notes) {
        this.name = name;
        this.milk = milk;
        this.price = price;
        this.notes = notes;
    }

    @Override
    public void grind() {
        log.info("\t# Grind coffee finely...");
    }

    @Override
    public void pour() {
        log.info("\t# Pour coffee in a cup!");
    }

    @Override
    public String toString() {
        return "Coffee: [name '" + name + "', milk '" + milk + "', price '" + price + "', notes '" + notes + "']";
    }
}
