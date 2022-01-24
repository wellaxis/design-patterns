package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.injection.DependencyInjection;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Dependency injection unit test
 * User: Wellaxis
 * Date: 24.02.2022
 */
@Slf4j
@Tag("creational")
@Tag("dependency-injection")
@DisplayName("Test: dependency injection pattern")
@SpringBootTest
public class DependencyInjectionUTest {

    @Nested
    @Tag("creational")
    @Tag("dependency-injection")
    @DisplayName("Test: dependency injection process")
    class DependencyInjectionTest {

        @Test
        @DisplayName("Test: dependency injection class")
        void patternIsCorrect() {

            assertThat(DependencyInjection.class)
                .as("Dependency injection class")
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
        @DisplayName("Test: dependency injection instance")
        void processIsCorrect() {
            IPattern dependencyInjection = new DependencyInjection();
            dependencyInjection.process();

            assertThat(dependencyInjection)
                .as("Dependency injection processor")
                .isInstanceOf(DependencyInjection.class)
                .isNotNull();
        }
    }
}
