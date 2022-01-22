package com.witalis.design.patterns.pattern.behavioral.iterator.content.object;

import com.witalis.design.patterns.pattern.behavioral.iterator.content.iterator.*;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
public abstract class Computer implements Device, Aggregator {
    private UUID id;
    private String name;
    private int version;
    private List<String> drivers;

    private class DriverIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            return index < drivers.size();
        }

        @Override
        public Object next() {
            return drivers.get(index++);
        }

        @Override
        public Object first() {
            return drivers.get(0);
        }

        @Override
        public Object last() {
            return drivers.get(drivers.size() - 1);
        }
    }

    protected Computer(String name, int version) {
        this.id = UUID.randomUUID();
        this.name = name;
        this.version = version;
        this.drivers = new ArrayList<>();
    }

    @Override
    public Iterator iterator() {
        return new DriverIterator();
    }

    public void installDriver(String driver) {
        drivers.add(driver);
    }

    public void uninstallDriver(String driver) {
        drivers.remove(driver);
    }

    public void installDrivers(List<String> driverList) {
        drivers.addAll(new ArrayList<>(driverList));
    }

    public void uninstallDrivers(List<String> driverList) {
        drivers.removeAll(new ArrayList<>(driverList));
    }

    @Override
    public String toString() {
        return "Device: [" + "id='" + id + "', " + "name='" + name + "', " + "version='" + version + ']';
    }
}
