package com.witalis.design.patterns.pattern.structural.marker.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Game console device
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class GameConsole extends Computer {

    public GameConsole(int id) {
        super(id);
    }

    public GameConsole(int id, String name) {
        super(id, name);
    }

    public GameConsole(int id, String name, String comments) {
        super(id, name, comments);
    }

    @Override
    public void use() {
        log.info("\t{}> Play online game...", getName().toLowerCase());
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
