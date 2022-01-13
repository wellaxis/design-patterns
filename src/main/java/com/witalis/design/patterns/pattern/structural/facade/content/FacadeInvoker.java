package com.witalis.design.patterns.pattern.structural.facade.content;

import com.witalis.design.patterns.pattern.structural.facade.content.facade.ComputerClub;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker facade class
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
public class FacadeInvoker {

    public void invoke() {
        log.info("\tFacade: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // club
            ComputerClub club = new ComputerClub("Perfection");

            // before the break
            log.info("\t$ The morning seance at 08:00.");
            club.startSession();
            club.stopSession();

            log.info("");
            log.info("\t@ The lunch break!!!");
            log.info("");

            // after the break
            log.info("\t$ The evening seance at 14:00.");
            club.startSession();
            club.stopSession();

            log.info("");

        } catch (Exception e) {
            log.error("\tFacade: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tFacade: end, time = {} ms", (end - begin) / 1000);
    }
}
