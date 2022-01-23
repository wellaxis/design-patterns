package com.witalis.design.patterns.pattern.behavioral.specification.content.object;

import lombok.Data;

/**
 * Desc: Device processor
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Data
public class DeviceCpu {
    private int cores;

    public DeviceCpu(int cores) {
        this.cores = cores;
    }
}
