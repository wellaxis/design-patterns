package com.witalis.design.patterns.pattern.behavioral.command.content.command;

import com.witalis.design.patterns.pattern.behavioral.command.content.object.Device;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Device command
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class DeviceCommand implements Command {
    private Device device;

    protected DeviceCommand(Device device) {
        this.device = device;
    }
}
