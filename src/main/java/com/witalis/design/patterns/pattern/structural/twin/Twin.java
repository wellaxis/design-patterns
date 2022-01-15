package com.witalis.design.patterns.pattern.structural.twin;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.twin.content.TwinInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Twin pattern
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Pattern(
    name = "Twin",
    type = Classification.STRUCTURAL,
    isClassical = false
)
public class Twin implements IPattern {

    /**
     * Definition:
     * -----------
     * Twin -> allows developers to model multiple inheritance in programming languages
     * that do not support multiple inheritance. This pattern avoids
     * many of the problems with multiple inheritance.
     * <p>
     * Instead of having a single class which is derived from two super-classes,
     * have two separate sub-classes each derived from one of the two super-classes.
     * These two sub-classes are closely coupled, so,
     * both can be viewed as a Twin object having two ends.
     * <p>
     * Efficiency - Since the Twin pattern uses composition which requires
     * message forwarding, the Twin pattern may be less efficient than inheritance.
     * However, since multiple inheritance is slightly less efficient than single
     * inheritance anyway, the overhead will not be a major problem.
     * <p>
     * Algorithm:
     * ----------
     * 1. To create the 1st common interface for set of entities.
     * 2. To create the 1st entity implementation based on the 1st interface.
     * 3. To create the 2nd common interface for set of entities.
     * 4. To create the 2nd entity implementation based on the 2nd interface.
     * 5. To add twin variables to both classes via composition to link them.
     * <p>
     * Example:
     * --------
     * 1. The 1st interface -> Device { void use(); }
     * 2. The 1st twin class -> Computer [Webcam] { void use(); }
     * 3. The 2nd interface -> Flyable { void fly(); }
     * 4. The 2nd twin class -> Aircraft [Copter] { void fly(); }
     * 5. Twin variables -> Webcam { Copter twin; }, Copter { Webcam twin; }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[twin]: process ======================");
        var twin = new TwinInvoker();
        twin.invoke();
        log.info("=================================================================");
    }
}
