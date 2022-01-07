package com.witalis.design.patterns.pattern.structural.adapter.content.adapter;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mega Hz frequency adapter
 * User: Wellaxis
 * Date: 28.12.2021
 */
@EqualsAndHashCode(callSuper = true)
@Slf4j
@Data
@NoArgsConstructor
public class MHzAdapter extends HertzAdapter {

    @Override
    public String getDescription() {
        return "Mega Hertz";
    }

    // convert frequency from giga to mega
    @Override
    public double convert(double value) {
        return value * 1_000;
    }
}
