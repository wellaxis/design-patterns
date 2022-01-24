package com.witalis.design.patterns.pattern.creational.injection;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.injection.content.DependencyInjectionInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Dependency injection pattern
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Pattern(
    name = "Dependency injection",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class DependencyInjection implements IPattern {

    /**
     * Definition:
     * -----------
     * Dependency Injection -> is a technique in which an object receives other objects
     *     that it depends on, called dependencies. Typically, the receiving object
     *     is called a client and the passed-in ('injected') object is called a service.
     *     The code that passes the service to the client is called the injector.
     *     Instead of the client specifying which service it will use, the injector tells
     *     the client what service to use. The 'injection' refers to the passing
     *     of a dependency (a service) into the client that uses it.
     *
     *     Dependency injection is one form of the broader technique of inversion of control.
     *
     *     Dependency injection separates the creation of a client's dependencies
     *     from the client's behavior, which promotes loosely coupled programs
     *     and the dependency inversion and single responsibility principles.
     *
     *     Dependency injection involves four roles:
     *     * service -> the objects, which contain useful functionality
     *     * interfaces -> the objects, by which those services are known to other parts of the code
     *     * client -> the object, whose behavior depends on the services it uses
     *     * injector -> the object, which constructs the services and injects them into the client
     *
     * Algorithm:
     * ----------
     * 1. To create a service interface for set of entities.
     * 2. To create implementation classes based on service interface as services.
     * 3. To create an injector interface for set of entities for client.
     * 4. To create implementation classes based on injector interface as injectors.
     * 5. To implement the injection mechanism for dependencies (constructor, setter, annotations, etc.).
     * 6. To implement dependencies call-methods as inversion of control.
     *
     * Example:
     * --------
     * 1. Service interface -> Software { boolean usedBy(); }
     * 2. Service classes -> OperatingSystem [Windows, Ubuntu, Mac] { boolean usedBy(); }
     * 3. Injector interface -> Device { void use(); }
     * 4. Injector classes -> Computer [Laptop, Mobile, Tablet], { void use(); }
     * 5. Injection via constructor -> Computer { Computer(String name, Software software) {} }
     * 6. Dependencies methods -> Computer { void use() { software.usedBy(this); } }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[dependency-injection]: process ======");
        var dependencyInjection = new DependencyInjectionInvoker();
        dependencyInjection.invoke();
        log.info("=================================================================");
    }
}
