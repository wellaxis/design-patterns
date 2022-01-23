package com.witalis.design.patterns.pattern.behavioral.chain.content.chain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Installer - garbage
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class GarbageInstaller extends SoftwareInstaller {

    public GarbageInstaller() {
        super(InstallOption.IGNORE);
    }

    @Override
    public void install(String update) {
        log.info("\t> Update is not significant, you can ignore it...");
    }
}
