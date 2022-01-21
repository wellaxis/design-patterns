package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.mediator.Mediator;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Mediator unit test
 * User: Wellaxis
 * Date: 21.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("mediator")
@DisplayName("Test: mediator pattern")
@SpringBootTest
public class MediatorUTest {

    @Nested
    @Tag("behavioral")
    @Tag("mediator")
    @DisplayName("Test: mediator process")
    class MediatorTest {

        @Test
        @DisplayName("Test: mediator class")
        void patternIsCorrect() {

            assertThat(Mediator.class)
                .as("Mediator class")
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
        @DisplayName("Test: mediator instance")
        void processIsCorrect() {
            IPattern mediator = new Mediator();
            mediator.process();

            assertThat(mediator)
                .as("Mediator processor")
                .isInstanceOf(Mediator.class)
                .isNotNull();
        }
    }
}
