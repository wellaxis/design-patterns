package com.witalis.design.patterns.pattern.behavioral.chain;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.chain.content.ChainResponsibilityInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Chain of responsibility pattern
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Pattern(
    name = "Chain of responsibility",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class ChainResponsibility implements IPattern {

    /**
     * Definition:
     * -----------
     * Chain of Responsibility -> consisting of a source of command objects
     *     and a series of processing objects. Each processing object contains
     *     logic that defines the types of command objects that it can handle;
     *     the rest are passed to the next processing object in the chain.
     *     A mechanism also exists for adding new processing objects to the end of this chain.
     *
     *     This pattern promotes the idea of loose coupling.
     *
     *     Define a chain of receiver objects having the responsibility,
     *     depending on run-time conditions, to either handle a request
     *     or forward it to the next receiver on the chain (if any).
     *     This enables us to send a request to a chain of receivers without
     *     having to know which one handles the request.
     *     The request gets passed along the chain until a receiver handles the request.
     *     The sender of a request is no longer coupled to a particular receiver.
     *
     * Algorithm:
     * ----------
     * 1. To create common interface for set of entities.
     * 2. To create multiple entities implementations based on common interface.
     * 3. To create handler interface to handle incoming requests.
     * 4. To create multiple receiver implementations based on handler interface.
     * 5. To add next receiver variable to forward chain requests.
     * 6. To add base handler method for sender to process requests.
     * 7. To add receiver methods for handling or forwarding a request.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity classes -> Computer [Laptop, Tablet, Mobile, etc.]
     * 3. Handler interface -> Installer { void install(String update); }
     * 4. Receiver classes -> SoftwareInstaller [Garbage, Usual, Useful, Important, Critical, etc.]
     * 5. Next receiver variable -> SoftwareInstaller { SoftwareInstaller nextInstaller; }
     * 6. Handler method -> SoftwareInstaller { installUpdate(String update, InstallOption priority); }
     * 7. Receiver methods -> Usual, Useful, Important { @Override install(String update); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[chain-of-responsibility]: process ===");
        var chainResponsibility = new ChainResponsibilityInvoker();
        chainResponsibility.invoke();
        log.info("=================================================================");
    }
}
