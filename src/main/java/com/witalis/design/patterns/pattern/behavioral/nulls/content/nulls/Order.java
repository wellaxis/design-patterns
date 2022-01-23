package com.witalis.design.patterns.pattern.behavioral.nulls.content.nulls;

import com.witalis.design.patterns.pattern.behavioral.nulls.content.object.Device;

import java.util.List;

/**
 * Desc: Order interface
 * User: Wellaxis
 * Date: 23.01.2022
 */
public interface Order {
    int MAX_QTY = 20;
    int REQ_PCT = 60;

    void order(List<Device> devices);
}
