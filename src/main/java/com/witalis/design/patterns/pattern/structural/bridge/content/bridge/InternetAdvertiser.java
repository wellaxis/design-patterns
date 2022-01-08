package com.witalis.design.patterns.pattern.structural.bridge.content.bridge;

import com.witalis.design.patterns.pattern.structural.bridge.content.object.Device;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Internet advertiser
 * User: Wellaxis
 * Date: 09.01.2022
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode(callSuper = false)
public class InternetAdvertiser extends Advertiser {

    public InternetAdvertiser(Device device) {
        super(device);
    }

    @Override
    public void promoteDevice() {
        log.info(
            "\t$ Advertising {} via internet portal in progress...",
            device.getClass().getSimpleName()
        );
        device.use();
    }
}
