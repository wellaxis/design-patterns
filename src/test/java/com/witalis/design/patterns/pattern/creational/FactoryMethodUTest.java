package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.method.FactoryMethod;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Factory method unit test
 * User: Wellaxis
 * Date: 30.12.2021
 */
@Slf4j
@Tag("creational")
@Tag("factory-method")
@DisplayName("Test: factory method pattern")
@SpringBootTest
public class FactoryMethodUTest {

    @Nested
    @Tag("creational")
    @Tag("factory-method")
    @DisplayName("Test: factory method process")
    class FactoryMethodTest {

        @Test
        @DisplayName("Test: factory method class")
        void patternIsCorrect() {

            assertThat(FactoryMethod.class)
                .as("Factory method class")
                .isPublic()
                .isNotFinal()
                .hasAnnotations(
                    Pattern.class
                )
                .hasSuperclass(Object.class)
                .hasDeclaredFields(
                    "log"
                )
                .hasDeclaredMethods(
                    "process"
                );
        }

        @Test
        @DisplayName("Test: factory method instance")
        void processIsCorrect() {
            IPattern factoryMethod = new FactoryMethod();
            factoryMethod.process();

            assertThat(factoryMethod)
                .as("Factory method processor")
                .isInstanceOf(FactoryMethod.class)
                .isNotNull();
        }
    }
}
