package com.witalis.design.patterns.pattern.behavioral.command;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.command.content.CommandInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Command pattern
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Pattern(
    name = "Command",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class Command implements IPattern {

    /**
     * Definition:
     * -----------
     * Command -> is a behavioral design pattern in which an object is used to encapsulate
     *     all information needed to perform an action or trigger an event at a later time.
     *     This information includes the method name, the object that owns the method
     *     and values for the method parameters.
     *
     *     Four terms always associated with the command pattern are:
     *     1) command - knows about receiver and invokes a method of the receiver
     *     2) receiver - does the work when the `execute()` method in command is called
     *     3) invoker - knows how to execute a command
     *     4) client - decides which receiver objects it assigns to the command objects
     *
     *     The central ideas of command design pattern closely mirror the semantics of
     *     first-class functions and higher-order functions in functional programming languages.
     *     Specifically, the invoker object is a higher-order function of which
     *     the command object is a first-class argument.
     *
     * Algorithm:
     * ----------
     * 1. To create a receiver interface for set of entities.
     * 2. To create implementation classes based on receiver interface.
     * 3. To create command interface for handle some actions.
     * 4. To create implementation classes based on command interface.
     * 5. To create invoker interface to execute commands.
     * 6. To create implementation classes based on invoker interface.
     * 7. To add execute method to command hierarchy.
     * 8. To add execute method to invoker hierarchy.
     * 9. To add action methods to process different commands.
     *
     * Example:
     * --------
     * 1. Receiver interface -> Device { use(), turnOn(), turnOff(), installDriver(); }
     * 2. Receiver classes -> Computer [Laptop, Mobile, Tablet] { void use(); }
     * 3. Command interface -> Command { void execute(); }
     * 4. Command classes -> DeviceCommand [TurnOn, TurnOff, InstallDriver] { void execute(); }
     * 5. Invoker interface -> Invoker { void execute(String commandName); }
     * 6. Invoker classes -> DeviceOwner { @Override public void execute(String commandName); }
     * 7. Command method -> TurnOnCommand { @Override execute() { getDevice().turnOn(); } }
     * 8. Invoker method -> DeviceOwner { @Override public void execute(String commandName); }
     * 9. Receiver methods -> Computer { @Override turnOn(), turnOff(), installDriver(); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[command]: process ===================");
        var command = new CommandInvoker();
        command.invoke();
        log.info("=================================================================");
    }
}
