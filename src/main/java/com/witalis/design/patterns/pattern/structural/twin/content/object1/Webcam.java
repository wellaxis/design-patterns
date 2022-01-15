package com.witalis.design.patterns.pattern.structural.twin.content.object1;

import com.witalis.design.patterns.pattern.structural.twin.content.object2.Copter;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Webcam device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
public class Webcam extends Computer {
    private Copter twin;

    public Webcam(String name) {
        super(name);
    }

    public Copter getTwin() {
        return twin;
    }

    public void setTwin(Copter twin) {
        this.twin = twin;
    }

    public void recordVideo() {
        log.info("\t> Record the video in HD format.");
    }

    @Override
    public void use() {
        log.info("\t> Operation system loading...");
        log.info("\t> System drivers installing...");
        log.info("\t> Camera transmits the image...");
    }

    public void fly() {
        if (twin != null) twin.fly();
    }

    public void hoverInAir() {
        if (twin != null) twin.hoverInAir();
    }

    @Override
    public String toString() {
        var twinInfo = "none";
        if (twin != null) {
            twinInfo = twin.getClass().getSimpleName().toLowerCase() + ": " + twin.getName();
        }
        return super.toString() + ", Aircraft [" + twinInfo + "]";
    }
}
