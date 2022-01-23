package com.witalis.design.patterns.pattern.behavioral.chain.content.chain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Installer - useful
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UsefulInstaller extends SoftwareInstaller {

    public UsefulInstaller() {
        super(InstallOption.DOWNLOAD);
    }

    @Override
    public void install(String update) {
        log.info("\t> Update will be download only...");
    }
}
