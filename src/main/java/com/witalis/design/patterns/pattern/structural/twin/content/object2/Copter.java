package com.witalis.design.patterns.pattern.structural.twin.content.object2;

import com.witalis.design.patterns.pattern.structural.twin.content.object1.Webcam;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Copter aircraft
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
public class Copter extends Aircraft {
    private Webcam twin;

    public Copter(String name) {
        super(name);
    }

    public Webcam getTwin() {
        return twin;
    }

    public void setTwin(Webcam twin) {
        this.twin = twin;
    }

    public void hoverInAir() {
        log.info("\t# Hover in the air and inspect the area.");
    }

    @Override
    public void fly() {
        log.info("\t# Warm up the engines...");
        log.info("\t# Take off vertically...");
        log.info("\t# Fly to destinations...");
    }

    public void use() {
        if (twin != null) twin.use();
    }

    public void recordVideo() {
        if (twin != null) twin.recordVideo();
    }

    @Override
    public String toString() {
        var twinInfo = "none";
        if (twin != null) {
            twinInfo = twin.getClass().getSimpleName().toLowerCase() + ": " + twin.getName();
        }
        return super.toString() + ", Computer [" + twinInfo + "]";
    }
}
