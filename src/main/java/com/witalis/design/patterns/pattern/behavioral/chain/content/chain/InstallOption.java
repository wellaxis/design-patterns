package com.witalis.design.patterns.pattern.behavioral.chain.content.chain;

/**
 * Desc: Install option enumeration
 * User: Wellaxis
 * Date: 23.01.2022
 */
public enum InstallOption {
    IGNORE(0),
    NOTIFY(1),
    DOWNLOAD(2),
    INSTALL(3),
    RESTART(4);

    private final int priority;

    InstallOption(int priority) {
        this.priority = priority;
    }

    public int getPriority() {
        return priority;
    }
}
