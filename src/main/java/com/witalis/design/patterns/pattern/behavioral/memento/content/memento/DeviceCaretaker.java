package com.witalis.design.patterns.pattern.behavioral.memento.content.memento;

import com.witalis.design.patterns.pattern.behavioral.memento.content.object.DeviceType;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;

/**
 * Desc: Memento caretaker class
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
@ToString
@EqualsAndHashCode
@AllArgsConstructor
public class DeviceCaretaker {
    private Map<DeviceType, DeviceMemento> mementos;

    public DeviceCaretaker() {
        this.mementos = new HashMap<>();
    }

    public DeviceMemento getMemento(DeviceType type) {
        return mementos.get(type);
    }

    public void setMemento(DeviceMemento memento) {
        if (memento != null) {
            mementos.put(memento.getType(), memento);
        }
    }
}
