package com.witalis.design.patterns.pattern.structural.facade.content.facade;

import com.witalis.design.patterns.pattern.structural.facade.content.object.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Computer club facade
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class ComputerClub implements DeviceFacade {
    private final String name;
    private final Laptop laptop;
    private final Tablet tablet;
    private final Mobile mobile;

    public ComputerClub(String name) {
        this.name = name;
        this.laptop = new Laptop();
        this.tablet = new Tablet();
        this.mobile = new Mobile();
    }

    @Override
    public void startSession() {
        log.info("\t$ Turn on all devices...");
        laptop.loadSystem();
        tablet.playGame();
        mobile.callToFriends();
        laptop.defineSettings();
        mobile.checkVideos();
        tablet.watchFilm();
    }

    @Override
    public void stopSession() {
        laptop.powerOff();
        log.info("\t$ Turn off all devices...");
    }
}
