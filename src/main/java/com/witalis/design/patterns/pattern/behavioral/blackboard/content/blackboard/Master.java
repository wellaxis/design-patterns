package com.witalis.design.patterns.pattern.behavioral.blackboard.content.blackboard;

import com.witalis.design.patterns.pattern.behavioral.blackboard.content.object.Device;

/**
 * Desc: Master interface
 * User: Wellaxis
 * Date: 24.01.2022
 */
public interface Master {
    String getName();
    int getSkills();
    boolean canFix(Device device);
    void fix(Device device);
}
