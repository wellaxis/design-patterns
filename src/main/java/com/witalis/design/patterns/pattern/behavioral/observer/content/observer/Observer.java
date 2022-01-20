package com.witalis.design.patterns.pattern.behavioral.observer.content.observer;

import java.time.LocalDateTime;

/**
 * Desc: Observer interface
 * User: Wellaxis
 * Date: 20.01.2022
 */
public interface Observer {
    void update(String token, int version, LocalDateTime modifyDate);
}
