package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.Device;

/**
 * Desc: Manager interface
 * User: Wellaxis
 * Date: 24.01.2022
 */
public interface Manager {
    String getName();
    void hireMaster(Master master);
    void fireMaster(Master master);
    void registerDevice(Device device);
}
