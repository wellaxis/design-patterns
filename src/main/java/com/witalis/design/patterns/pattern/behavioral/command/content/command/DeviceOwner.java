package com.witalis.design.patterns.pattern.behavioral.command.content.command;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * Desc: Device owner
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public class DeviceOwner implements Invoker {
    private String name;
    private final Map<String, Command> commands = new LinkedHashMap<>();

    public DeviceOwner(String name) {
        this.name = name;
    }

    public void register(String name, Command command) {
        commands.put(name, command);
    }

    @Override
    public void execute(String commandName) {
        Command command = commands.get(commandName);
        if (command == null) {
            throw new IllegalStateException(
                "Command '" + commandName + "' is not registered yet."
            );
        }
        command.execute();
    }

    public void executeAll() {
        commands.values().forEach(Command::execute);
    }

    @Override
    public String toString() {
        return "Owner [name='" + name + "', registered commands=" + commands.size() + "]";
    }
}
