package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.singleton.Singleton;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Singleton unit test
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Tag("creational")
@Tag("singleton")
@DisplayName("Test: singleton pattern")
@SpringBootTest
public class SingletonUTest {

    @Nested
    @Tag("creational")
    @Tag("singleton")
    @DisplayName("Test: singleton process")
    class SingletonTest {

        @Test
        @DisplayName("Test: singleton class")
        void patternIsCorrect() {

            assertThat(Singleton.class)
                .as("Singleton class")
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
        @DisplayName("Test: singleton instance")
        void processIsCorrect() {
            IPattern singleton = new Singleton();
            singleton.process();

            assertThat(singleton)
                .as("Singleton processor")
                .isInstanceOf(Singleton.class)
                .isNotNull();
        }
    }
}
