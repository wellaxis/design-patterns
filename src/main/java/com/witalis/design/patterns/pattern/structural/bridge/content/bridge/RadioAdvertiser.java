package com.witalis.design.patterns.pattern.structural.bridge.content.bridge;

import com.witalis.design.patterns.pattern.structural.bridge.content.object.Device;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Radio advertiser
 * User: Wellaxis
 * Date: 09.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class RadioAdvertiser extends Advertiser {

    public RadioAdvertiser(Device device) {
        super(device);
    }

    @Override
    public void promoteDevice() {
        log.info(
            "\t$ Advertising {} via radio station in progress...",
            device.getClass().getSimpleName()
        );
        device.use();
    }
}
