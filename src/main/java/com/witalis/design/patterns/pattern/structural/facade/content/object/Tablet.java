package com.witalis.design.patterns.pattern.structural.facade.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Tablet device
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Tablet extends Computer {

    public Tablet(String name) {
        super(name);
    }

    public Tablet(String name, String comments) {
        super(name, comments);
    }

    public void playGame() {
        log.info("\tTablet[{}]> Play online game...", getId());
    }

    public void watchFilm() {
        log.info("\tTablet[{}]> Watch a new film...", getId());
    }
}
