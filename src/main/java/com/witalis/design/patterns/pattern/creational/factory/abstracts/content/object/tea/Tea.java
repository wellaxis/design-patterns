package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.tea;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tea abstract class
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Data
public abstract class Tea implements ITea {
    private String name;
    private boolean sugar;
    private double price;
    private String notes;


    protected Tea(String name, boolean sugar, double price, String notes) {
        this.name = name;
        this.sugar = sugar;
        this.price = price;
        this.notes = notes;
    }

    @Override
    public void brew() {
        log.info("Brew tea fragrantly...");
    }

    @Override
    public void pour() {
        log.info("Pour tea in a cup!");
    }

    @Override
    public String toString() {
        return "Tea: [name '" + name + "', sugar '" + sugar + "', price '" + price + "', notes '" + notes + "']";
    }
}
