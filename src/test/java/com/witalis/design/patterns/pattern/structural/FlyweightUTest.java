package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.flyweight.Flyweight;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Flyweight unit test
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Tag("structural")
@Tag("flyweight")
@DisplayName("Test: flyweight pattern")
@SpringBootTest
public class FlyweightUTest {

    @Nested
    @Tag("structural")
    @Tag("flyweight")
    @DisplayName("Test: flyweight process")
    class FlyweightTest {

        @Test
        @DisplayName("Test: flyweight class")
        void patternIsCorrect() {

            assertThat(Flyweight.class)
                .as("Flyweight class")
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
        @DisplayName("Test: flyweight instance")
        void processIsCorrect() {
            IPattern flyweight = new Flyweight();
            flyweight.process();

            assertThat(flyweight)
                .as("Flyweight processor")
                .isInstanceOf(Flyweight.class)
                .isNotNull();
        }
    }
}
