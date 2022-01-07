package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.lazy.LazyInitialization;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Lazy initialization unit test
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Tag("creational")
@Tag("lazy-initialization")
@DisplayName("Test: lazy initialization pattern")
@SpringBootTest
public class LazyInitializationUTest {

    @Nested
    @Tag("creational")
    @Tag("lazy-initialization")
    @DisplayName("Test: lazy initialization process")
    class LazyInitializationTest {

        @Test
        @DisplayName("Test: lazy initialization class")
        void patternIsCorrect() {

            assertThat(LazyInitialization.class)
                .as("Lazy initialization class")
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
        @DisplayName("Test: lazy initialization instance")
        void processIsCorrect() {
            IPattern lazyInitialization = new LazyInitialization();
            lazyInitialization.process();

            assertThat(lazyInitialization)
                .as("Lazy initialization processor")
                .isInstanceOf(LazyInitialization.class)
                .isNotNull();
        }
    }
}
