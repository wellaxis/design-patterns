package com.witalis.design.patterns.pattern.behavioral.mediator.content.mediator;

import com.witalis.design.patterns.pattern.behavioral.mediator.content.object.Device;

/**
 * Desc: Mediator interface
 * User: Wellaxis
 * Date: 21.01.2022
 */
public interface Mediator {
    void mediate(Device device, String message);
}
