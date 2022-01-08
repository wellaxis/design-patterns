package com.witalis.design.patterns.pattern.structural.bridge.content.bridge;

import com.witalis.design.patterns.pattern.structural.bridge.content.object.Device;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Advertiser abstract class
 * User: Wellaxis
 * Date: 09.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
@NoArgsConstructor
public abstract class Advertiser implements Advertising {
    protected Device device;

    protected Advertiser(Device device) {
        this.device = device;
    }

    protected abstract void promoteDevice();

    @Override
    public void promote() {
        log.info("\t# Promotion: {}", getDevice());
        promoteDevice();
    }
}
