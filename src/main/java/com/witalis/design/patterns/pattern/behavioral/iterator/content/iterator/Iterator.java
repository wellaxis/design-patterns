package com.witalis.design.patterns.pattern.behavioral.iterator.content.iterator;

/**
 * Desc: Iterator interface
 * User: Wellaxis
 * Date: 22.01.2022
 */
public interface Iterator {
    boolean hasNext();
    Object next();
    Object first();
    Object last();
}
