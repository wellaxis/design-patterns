package com.witalis.design.patterns.pattern.structural.adapter.content;

import com.witalis.design.patterns.pattern.structural.adapter.content.adapter.*;
import com.witalis.design.patterns.pattern.structural.adapter.content.object.*;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Desc: Invoker adapter class
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
public class AdapterInvoker {

    public void invoke() {
        log.info("\tAdapter: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // adapters
            FrequencyAdapter single = new HzAdapter();
            FrequencyAdapter kilo = new KHzAdapter();
            FrequencyAdapter mega = new MHzAdapter();
            var adapters = List.of(single, kilo, mega);

            // laptop
            Device laptop = new Laptop("MacBook", "Air");
            scenario(laptop, adapters);

            log.info("");

            // tablet
            Device tablet = new Tablet("Galaxy Tab", "Pro");
            scenario(tablet, adapters);

            log.info("");

            // mobile
            Device mobile = new Mobile("Google Pixel", "Dual");
            scenario(mobile, adapters);

            log.info("");

        } catch (Exception e) {
            log.error("\tAdapter: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tAdapter: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Device device, List<FrequencyAdapter> adapters) {
        log.info("\tComputer: {}", device.toString());
        log.info("\tFrequency[Giga Hertz]: {}", device.getSpeed());
        for (FrequencyAdapter adapter: adapters) {
            ((HertzAdapter) adapter).setDevice(device);
            log.info("\t= in {}: {}", adapter.getDescription(), adapter.getValue());
        }
    }
}
