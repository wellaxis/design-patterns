package com.witalis.design.patterns.pattern.behavioral.chain.content.chain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Installer - usual
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class UsualInstaller extends SoftwareInstaller {

    public UsualInstaller() {
        super(InstallOption.NOTIFY);
    }

    @Override
    public void install(String update) {
        log.info("\t> Update has been detected as common upgrade...");
    }
}
