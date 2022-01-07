package com.witalis.design.patterns.pattern.structural.adapter.content.adapter;

import com.witalis.design.patterns.pattern.structural.adapter.content.object.Device;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Hertz frequency adapter
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class HertzAdapter implements FrequencyAdapter {
    private Device device;

    protected HertzAdapter(Device device) {
        this.device = device;
    }

    @Override
    public String getDescription() {
        return "Giga Hertz";
    }

    @Override
    public double getValue() {
        return convert(device.getSpeed());
    }

    // convert frequency from one unit to another
    protected abstract double convert(double value);
}
