package com.witalis.design.patterns.pattern.creational.factory.method.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.method.content.object.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer shop
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
@Data
public abstract class ComputerShop implements DeviceShop {
    private final DeviceRank rank;

    protected ComputerShop(DeviceRank rank) {
        this.rank = rank;
    }

    /**
     * Abstract factory method to create an entity instance.
     * Entity creation is delegated to all derived subclasses.
     * <p/>
     * @param type the type of required entity
     * @return the instance of required entity
     */
    public abstract Device create(DeviceType type);

    public Device order(DeviceType type) {
        Device device = create(type);

        device.charge();
        device.turnOn();
        device.check();
        device.use();
        device.turnOff();
        device.clean();

        log.info(
            "\t$ The {} device is ready, thanks for business!",
            getRank().name().toLowerCase()
        );
        return device;
    }
}
