package com.witalis.design.patterns.pattern.creational.builder.content;

import com.witalis.design.patterns.pattern.creational.builder.content.object.Account;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Desc: Invoker builder pattern
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
public class BuilderInvoker {

    public void invoke() {
        log.info("\tBuilder: begin");
        long begin = System.nanoTime();
        try {
            var account = Account.builder()
                .setId(UUID.randomUUID())
                .setName("VIP")
                .setBalance(10_000D)
                .setActive(true)
                .setActivation(LocalDateTime.now())
                .setComments("Account builder.")
                .build();

            log.info("\tAccount: {}", account.toString());
        } catch (Exception e) {
            log.error("\tBuilder: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tBuilder: end, time = {} ms", (end - begin) / 1000);
    }
}
