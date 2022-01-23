package com.witalis.design.patterns.pattern.behavioral.nulls.content.nulls;

import com.witalis.design.patterns.pattern.behavioral.nulls.content.object.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.ThreadLocalRandom;

import static com.witalis.design.patterns.pattern.behavioral.nulls.content.nulls.Order.MAX_QTY;

/**
 * Desc: Device utilities
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class DeviceUtils {

    /**
     * It generates the list of devices based on required types & max quantity.
     * <p/>
     * @param types    the list of required devices
     * @return the list of initialized devices
     */
    public static List<Device> formalize(List<String> types) {
        var random = ThreadLocalRandom.current();
        int orderQty = random.nextInt(1, MAX_QTY + 1);

        List<Device> devices = new ArrayList<>(orderQty);
        for (int i = 0; i < orderQty; i++) {
            int index = random.nextInt(0, types.size());
            String type = types.get(index);

            Optional<DeviceType> deviceType = Arrays.stream(DeviceType.values())
                .filter(dt -> dt.name().equalsIgnoreCase(type))
                .findFirst();

            Device device;
            if (deviceType.isPresent()) {
                var comment = "Item #" + (i + 1);
                device = switch (deviceType.get()) {
                    case LAPTOP -> new Laptop(type, comment, 100);
                    case TABLET -> new Tablet(type, comment, 100);
                    case MOBILE -> new Mobile(type, comment, 100);
                };
            } else {
                device = new NullDevice(type, "", -1);
            }
            devices.add(device);
        }
        return devices;
    }
}
