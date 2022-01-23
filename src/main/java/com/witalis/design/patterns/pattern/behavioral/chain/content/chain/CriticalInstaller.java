package com.witalis.design.patterns.pattern.behavioral.chain.content.chain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Installer - critical
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class CriticalInstaller extends SoftwareInstaller {

    public CriticalInstaller() {
        super(InstallOption.RESTART);
    }

    @Override
    public void install(String update) {
        log.info("\t> Update is urgent. System will be restarted after update!");
    }
}
