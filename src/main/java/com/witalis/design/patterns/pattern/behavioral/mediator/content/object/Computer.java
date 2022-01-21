package com.witalis.design.patterns.pattern.behavioral.mediator.content.object;

import com.witalis.design.patterns.pattern.behavioral.mediator.content.mediator.Mediator;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 21.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private String comments;
    private int version;
    private Mediator mediator;

    protected Computer(String name, String comments, int version) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.comments = comments;
        this.version = version;
    }

    @Override
    public void readMessage(String incomingMessage) {
        log.info("\t[{}]> read <- {}", name, incomingMessage);
    }

    @Override
    public void sendMessage(String outgoingMessage) {
        log.info("\t[{}]> send -> {}", name, outgoingMessage);
        mediator.mediate(this, outgoingMessage);
    }

    @Override
    public String toString() {
        return "Device: [" + "id='" + id + "', " + "name='" + name + "', " + "comments='" + comments + "', " + "version='" + version + ']';
    }
}
