package com.witalis.design.patterns.pattern.behavioral.servant.content.servant;

import com.witalis.design.patterns.pattern.behavioral.servant.content.object.Device;

/**
 * Desc: Session interface
 * User: Wellaxis
 * Date: 24.01.2022
 */
public interface Session {
    void prepare(Device device, boolean force);
    void process(Device device, String token);
    void complete(Device device, boolean force);
}
