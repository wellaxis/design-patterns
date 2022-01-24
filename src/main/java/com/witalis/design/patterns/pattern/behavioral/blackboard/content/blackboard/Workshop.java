package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.Device;

/**
 * Desc: Workshop
 * User: Wellaxis
 * Date: 24.01.2022
 */
public interface Workshop {
    void acceptDevice(Device device);
    void notifyManager(Device device);
}
