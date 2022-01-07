package com.witalis.design.patterns.pattern.structural.adapter.content.adapter;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Hz frequency adapter
 * User: Wellaxis
 * Date: 28.12.2021
 */
@EqualsAndHashCode(callSuper = true)
@Slf4j
@Data
@NoArgsConstructor
public class HzAdapter extends HertzAdapter {

    @Override
    public String getDescription() {
        return "Hertz";
    }

    // convert frequency from giga to single
    @Override
    public double convert(double value) {
        return value * 1_000 * 1_000 * 1_000;
    }
}
