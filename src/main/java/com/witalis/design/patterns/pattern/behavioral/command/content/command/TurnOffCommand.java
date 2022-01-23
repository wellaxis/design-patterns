package com.witalis.design.patterns.pattern.behavioral.command.content.command;

import com.witalis.design.patterns.pattern.behavioral.command.content.object.Device;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Command - turn off
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class TurnOffCommand extends DeviceCommand {

    public TurnOffCommand(Device device) {
        super(device);
    }

    @Override
    public void execute() {
        getDevice().turnOff();
    }
}
