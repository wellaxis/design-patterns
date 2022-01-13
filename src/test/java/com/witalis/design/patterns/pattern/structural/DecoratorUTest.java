package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.decorator.Decorator;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Decorator unit test
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Tag("structural")
@Tag("decorator")
@DisplayName("Test: decorator pattern")
@SpringBootTest
public class DecoratorUTest {

    @Nested
    @Tag("structural")
    @Tag("decorator")
    @DisplayName("Test: decorator process")
    class DecoratorTest {

        @Test
        @DisplayName("Test: decorator class")
        void patternIsCorrect() {

            assertThat(Decorator.class)
                .as("Decorator class")
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
        @DisplayName("Test: decorator instance")
        void processIsCorrect() {
            IPattern decorator = new Decorator();
            decorator.process();

            assertThat(decorator)
                .as("Decorator processor")
                .isInstanceOf(Decorator.class)
                .isNotNull();
        }
    }
}
