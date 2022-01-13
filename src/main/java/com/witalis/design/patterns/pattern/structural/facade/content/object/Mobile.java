package com.witalis.design.patterns.pattern.structural.facade.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Mobile device
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Mobile extends Computer {

    public Mobile(String name) {
        super(name);
    }

    public Mobile(String name, String comments) {
        super(name, comments);
    }

    public void callToFriends() {
        log.info("\tMobile[{}]> Call to your friends...", getId());
    }

    public void checkVideos() {
        log.info("\tMobile[{}]> Check youtube videos...", getId());
    }
}
