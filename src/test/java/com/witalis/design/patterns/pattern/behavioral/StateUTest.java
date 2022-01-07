package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.state.State;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: State unit test
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Tag("behavioral")
@Tag("state")
@DisplayName("Test: state pattern")
@SpringBootTest
public class StateUTest {

    @Nested
    @Tag("behavioral")
    @Tag("state")
    @DisplayName("Test: state process")
    class StateTest {

        @Test
        @DisplayName("Test: state class")
        void patternIsCorrect() {

            assertThat(State.class)
                .as("State class")
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
        @DisplayName("Test: state instance")
        void processIsCorrect() {
            IPattern state = new State();
            state.process();

            assertThat(state)
                .as("State processor")
                .isInstanceOf(State.class)
                .isNotNull();
        }
    }
}
