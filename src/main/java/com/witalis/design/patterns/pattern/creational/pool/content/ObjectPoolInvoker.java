package com.witalis.design.patterns.pattern.creational.pool.content;

import com.witalis.design.patterns.pattern.creational.pool.content.object.*;
import com.witalis.design.patterns.pattern.creational.pool.content.pool.*;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc: Invoker object pool pattern
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
public class ObjectPoolInvoker {

    public void invoke() {
        log.info("\tObject Pool: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // before
            ComputerPool.statistics();

            log.info("");

            // the 1st scenario - a single device
            log.info("\t> The 1st scenario: a single device");
            Device single = ComputerPool.receive();
            ComputerPool.statistics();
            ComputerPool.release(single);
            ComputerPool.statistics();

            log.info("");

            // the 2nd scenario - pair of devices
            log.info("\t> The 2nd scenario: pair of devices");
            Device first = ComputerPool.receive();
            Device second = ComputerPool.receive();
            ComputerPool.statistics();
            ComputerPool.release(first);
            Device third = ComputerPool.receive();
            ComputerPool.statistics();
            ComputerPool.release(second);
            ComputerPool.release(third);
            ComputerPool.statistics();

            log.info("");

            // the 3rd scenario - list of devices
            log.info("\t> The 3rd scenario: list of devices");
            final int size = 5;
            ComputerPool.statistics();
            List<Device> devices = new ArrayList<>(size);
            for (int i = 0; i < size; i++) {
                Device device = ComputerPool.receive();
                devices.add(device);
            }
            ComputerPool.statistics();
            for (int i = 0; i < size; i++) {
                ComputerPool.release(devices.get(i));
            }
            ComputerPool.statistics();

            log.info("");

            ComputerPool.terminate();

        } catch (Exception e) {
            log.error("\tObject Pool: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tObject Pool: end, time = {} ms", (end - begin) / 1000);
    }
}
