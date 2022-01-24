package com.witalis.design.patterns.pattern.behavioral.blackboard;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.blackboard.content.BlackboardInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Blackboard pattern
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Pattern(
    name = "Blackboard",
    type = Classification.BEHAVIORAL,
    isClassical = false
)
public class Blackboard implements IPattern {

    /**
     * Definition:
     * -----------
     * Blackboard -> provides a computational framework for the design and implementation
     *     of systems that integrate large and diverse specialized modules,
     *     and implement complex, non-deterministic control strategies.
     *
     *     The blackboard model defines three main components:
     *     1) blackboard - a structured global memory containing objects from the solution space
     *     2) knowledge sources - specialized modules with their own representation
     *     3) control component - selects, configures and executes modules
     *
     *     The blackboard pattern provides effective solutions for designing and implementing
     *     complex systems where heterogeneous modules have to be dynamically combined to solve a problem.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for set of objects.
     * 2. To create multiple implementation classes based on common interface.
     * 3. To create a blackboard interface to contain the common objects.
     * 4. To create blackboard classes based on blackboard interface.
     * 5. To create a knowledge source interface to process the common objects.
     * 6. To create knowledge source classes based on knowledge source interface.
     * 7. To create a control interface to configure the sources processing.
     * 8. To create control classes based on control interface.
     * 9. To add input blackboard method to get objects for processing.
     * 10. To add selection control method to activates a required knowledge source for processing.
     * 11. To add action knowledge source method to process object & interact with blackboard.
     *
     * Example:
     * --------
     * 1. Object interface -> Device { check(), use(), etc. }
     * 2. Object classes -> Computer [Laptop, Mobile, Tablet], { void use(), etc. }
     * 3. Blackboard interface -> Workshop { acceptDevice(), notifyManager(), etc. }
     * 4. Blackboard classes -> DeviceWorkshop [Computer], { Map<String, Device> devices; }
     * 5. Knowledge source interface -> Master { boolean canFix(), void fix(), etc. }
     * 6. Knowledge source classes -> DeviceMaster [Computer], { List<DeviceType> specializations; }
     * 7. Control interface -> Manager { hire/fireMaster(), registerDevice(), etc. }
     * 8. Control classes -> DeviceManager [Computer], { Map<String, Master> masters; }
     * 9. Input blackboard method -> DeviceWorkshop { @Override void acceptDevice(Device device); }
     * 10. Selection control method -> DeviceManager { @Override void registerDevice(Device device); }
     * 11. Action knowledge source method -> DeviceMaster { @Override void fix(Device device); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[blackboard]: process ================");
        var blackboard = new BlackboardInvoker();
        blackboard.invoke();
        log.info("=================================================================");
    }
}
