package com.witalis.design.patterns.pattern.creational.factory.simple.content.object.coffee;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Coffee abstract class
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
@Data
public abstract class Coffee implements ICoffee {
    private String name;
    private boolean milk;
    private double price;
    private String notes;

    protected Coffee(String name, boolean milk, double price, String notes) {
        this.name = name;
        this.milk = milk;
        this.price = price;
        this.notes = notes;
    }

    @Override
    public void grind() {
        log.info("Grind coffee finely...");
    }

    @Override
    public void pour() {
        log.info("Pour coffee in a cup!");
    }

    @Override
    public String toString() {
        return "Coffee: [name '" + name + "', milk '" + milk + "', price '" + price + "', notes '" + notes + "']";
    }
}
