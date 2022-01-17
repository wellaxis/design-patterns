package com.witalis.design.patterns.pattern.behavioral.memento.content.object;

import com.witalis.design.patterns.pattern.behavioral.memento.content.memento.DeviceMemento;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device {
    private UUID id;
    private String name;
    private String comments;
    private double price;
    private int version;
    private boolean active;

    protected Computer(String name, String comments, double price, int version) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.comments = comments;
        this.price = price;
        this.version = version;
        this.active = true;
    }

    public abstract DeviceType getType();

    /**
     * It saves the snapshot of device.
     * </p>
     * @return the memento snapshot of device
     */
    public DeviceMemento save() {
        return new DeviceMemento(
            getType(),
            getName(),
            getComments(),
            getPrice(),
            getVersion(),
            isActive()
        );
    }

    /**
     * It restores the saved memento snapshot of device.
     * <p/>
     * @param memento the saved memento snapshot instance
     */
    public void load(DeviceMemento memento) {
        if (memento != null) {
            setName(memento.getName());
            setComments(memento.getComments());
            setPrice(memento.getPrice());
            setVersion(memento.getVersion());
            setActive(memento.isActive());
        }
    }

    @Override
    public String toString() {
        return "Device: [" +
            "id='" + id + "', " +
            "name='" + name + "', " +
            "comments='" + comments + "', " +
            "price=" + price + ", " +
            "version='" + version + "', " +
            "active=" + active +
            ']';
    }
}
