package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.SimpleFactory;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Simple factory unit test
 * User: Wellaxis
 * Date: 28.12.2021
 */
@Slf4j
@Tag("creational")
@Tag("simple-factory")
@DisplayName("Test: simple factory pattern")
@SpringBootTest
public class SimpleFactoryUTest {

    @Nested
    @Tag("creational")
    @Tag("simple-factory")
    @DisplayName("Test: simple factory process")
    class VisitorTest {

        @Test
        @DisplayName("Test: simple factory class")
        void patternIsCorrect() {

            assertThat(SimpleFactory.class)
                .as("Simple factory class")
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
        @DisplayName("Test: simple factory instance")
        void processIsCorrect() {
            IPattern simpleFactory = new SimpleFactory();
            simpleFactory.process();

            assertThat(simpleFactory)
                .as("Simple factory processor")
                .isInstanceOf(SimpleFactory.class)
                .isNotNull();
        }
    }
}
