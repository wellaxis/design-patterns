package com.witalis.design.patterns.pattern.behavioral.chain.content.chain;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Software installer
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class SoftwareInstaller implements Installer {
    private InstallOption option;
    private SoftwareInstaller nextInstaller;

    protected SoftwareInstaller(InstallOption option) {
        this.option = option;
    }

    public void installUpdate(String update, InstallOption priority) {
        // process installing based on priority level
        if (priority.getPriority() >= option.getPriority()) {
            install(update);
        }
        // add next installer to chain of updaters
        if (nextInstaller != null) {
            nextInstaller.installUpdate(update, priority);
        }
    }
}
