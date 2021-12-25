package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.builder.Builder;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Builder unit test
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Tag("creational")
@Tag("builder")
@DisplayName("Test: builder pattern")
@SpringBootTest
public class BuilderUTest {

    @Nested
    @Tag("creational")
    @Tag("builder")
    @DisplayName("Test: builder process")
    class BuilderTest {

        @Test
        @DisplayName("Test: builder class")
        void patternIsCorrect() {

            assertThat(Builder.class)
                .as("Builder class")
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
        @DisplayName("Test: builder instance")
        void processIsCorrect() {
            IPattern builder = new Builder();
            builder.process();

            assertThat(builder)
                .as("Builder processor")
                .isInstanceOf(Builder.class)
                .isNotNull();
        }
    }
}
