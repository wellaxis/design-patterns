package com.witalis.design.patterns.pattern.behavioral.chain.content;

import com.witalis.design.patterns.pattern.behavioral.chain.content.chain.*;
import com.witalis.design.patterns.pattern.behavioral.chain.content.object.*;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Invoker chain of responsibility pattern
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
public class ChainResponsibilityInvoker {

    public void invoke() {
        log.info("\tChain of Responsibility: begin");
        long begin = System.nanoTime();
        try {

            log.info("");

            // installers
            SoftwareInstaller garbage = new GarbageInstaller();
            SoftwareInstaller usual = new UsualInstaller();
            SoftwareInstaller useful = new UsefulInstaller();
            SoftwareInstaller important = new ImportantInstaller();
            SoftwareInstaller critical = new CriticalInstaller();

            // chain
            garbage.setNextInstaller(usual);
            usual.setNextInstaller(useful);
            useful.setNextInstaller(important);
            important.setNextInstaller(critical);

            // laptop
            Computer laptop = new Laptop("Super Laptop", 100);
            laptop.setInstaller(useful);
            scenario(laptop, "Antivirus Defender Update", InstallOption.RESTART);

            log.info("");

            // tablet
            Computer tablet = new Tablet("Power tablet", 100);
            tablet.setInstaller(garbage);
            scenario(tablet, "Application Store Update", InstallOption.INSTALL);

            log.info("");

            // mobile
            Computer mobile = new Mobile("Cheap mobile", 100);
            mobile.setInstaller(usual);
            scenario(mobile, "PDF Reader Update", InstallOption.DOWNLOAD);

            log.info("");

        } catch (Exception e) {
            log.error("\tChain of Responsibility: errors, {}", e.getMessage());
        }
        long end = System.nanoTime();
        log.info("\tChain of Responsibility: end, time = {} ms", (end - begin) / 1000);
    }

    private void scenario(Computer device, String update, InstallOption option) {
        // device representation
        log.info("\t# Device -> {}", device);
        // update information
        log.info("\t$ Update -> {}, importance => {}", update, option);
        // install software update
        device.getInstaller().installUpdate(update, option);
    }
}
