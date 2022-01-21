package com.witalis.design.patterns.pattern.behavioral.mediator.content.object;

/**
 * Desc: Device interface
 * User: Wellaxis
 * Date: 21.01.2022
 */
public interface Device {
    void use();
    void readMessage(String incomingMessage);
    void sendMessage(String outgoingMessage);
}
