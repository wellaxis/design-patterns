package com.witalis.design.patterns.pattern.creational.factory.abstracts.content.factory;

import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.coffee.*;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.content.object.device.*;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Base shop
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Data
public abstract class BaseShop implements Shop {
    private final String name;
    private final ShopRank rank;

    protected BaseShop(ShopRank rank, String name) {
        this.rank = rank;
        this.name = name;
    }

    /**
     * Abstract factory method to create a first entity instance.
     * A family of related multiple entities.
     * <p/>
     * @param type the type of required entity N1
     * @return the instance of required entity N1
     */
    protected abstract Coffee createCoffee(CoffeeType type);

    /**
     * Abstract factory method to create a second entity instance.
     * A family of related multiple entities.
     * <p/>
     * @param type the type of required entity N2
     * @return the instance of required entity N2
     */
    protected abstract Device createDevice(DeviceType type);

    @Override
    public Coffee orderCoffee(CoffeeType type) {
        Coffee coffee = createCoffee(type);

        coffee.grind();
        coffee.make();
        coffee.milk();
        coffee.pour();

        log.info(
            "\t$ The {} coffee is ready, bon appetit!",
            type.name().toLowerCase()
        );
        return coffee;
    }

    public Device orderDevice(DeviceType type) {
        Device device = createDevice(type);

        device.charge();
        device.turnOn();
        device.check();
        device.use();
        device.turnOff();
        device.clean();

        log.info(
            "\t$ The {} device is ready, thanks for business!",
            type.name().toLowerCase()
        );
        return device;
    }
}
