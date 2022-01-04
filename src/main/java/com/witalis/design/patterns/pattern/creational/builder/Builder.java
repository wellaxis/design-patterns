package com.witalis.design.patterns.pattern.creational.builder;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.builder.content.BuilderInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Builder pattern
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Pattern(
    name = "Builder",
    type = Classification.CREATIONAL
)
public class Builder implements IPattern {

    /**
     * Definition:
     * -----------
     * Builder -> separates the construction of a complex object from its representation,
     *     allowing the same construction process to create various representations.
     *
     * Algorithm:
     * ----------
     * 1. To create a required class with all fields and private constructor.
     * 2. To create a nested non-static class Builder with private constructor.
     * 3. To add a static method to initiate builder in main class.
     * 4. To add a lot of setters in builder class & return Builder.
     * 5. To add a non-static method to finally build instance of main class.
     *
     * Example:
     * --------
     * 1. Class -> Account [id, name, etc.], private constructor.
     * 2. Nested class -> Builder [no fields], private constructor.
     * 3. Static method -> static Builder builder() { return new Account().new Builder() }
     * 4. Builder setter -> Builder setName(String name) { Account.this.name = name; return this; }
     * 5. Builder build -> public Account build() { return Account.this; }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[builder]: process ===================");
        var builder = new BuilderInvoker();
        builder.invoke();
        log.info("=================================================================");
    }
}
