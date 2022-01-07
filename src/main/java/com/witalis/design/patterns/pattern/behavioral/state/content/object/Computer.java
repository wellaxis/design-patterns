package com.witalis.design.patterns.pattern.behavioral.state.content.object;

import com.witalis.design.patterns.pattern.behavioral.state.content.state.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public abstract class Computer implements Device {
    private final String name;
    private WorkingState workingState;

    protected Computer(String name, WorkingState workingState) {
        this.name = name;
        this.workingState = workingState;
    }

    public WorkingState getWorkingState() {
        return workingState;
    }

    public void setWorkingState(WorkingState workingState) {
        this.workingState = workingState;
    }

    @Override
    public void turnOn() {
        log.info("\t+ Turn on computer device");
    }

    @Override
    public void turnOff() {
        log.info("\t- Turn off computer device");
    }

    /**
     * To change state of object. Into class directly.
     */
    public void changeState() {
        if (workingState instanceof BrokenState) {
            setWorkingState(new ForRepairState());
        } else if (workingState instanceof ForRepairState) {
            setWorkingState(new RepairedState());
        } else if (workingState instanceof RepairedState) {
            setWorkingState(new FromRepairState());
        } else if (workingState instanceof FromRepairState) {
            setWorkingState(new ReadyState());
        }
    }

    public void check() {
        workingState.condition();
    }

    @Override
    public String toString() {
        return "Device [" + getClass().getSimpleName().toLowerCase() + ": " + name + "]";
    }
}
