package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.blackboard.Blackboard;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Blackboard unit test
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("blackboard")
@DisplayName("Test: blackboard pattern")
@SpringBootTest
public class BlackboardUTest {

    @Nested
    @Tag("behavioral")
    @Tag("blackboard")
    @DisplayName("Test: blackboard process")
    class BlackboardTest {

        @Test
        @DisplayName("Test: blackboard class")
        void patternIsCorrect() {

            assertThat(Blackboard.class)
                .as("Blackboard class")
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
        @DisplayName("Test: blackboard instance")
        void processIsCorrect() {
            IPattern blackboard = new Blackboard();
            blackboard.process();

            assertThat(blackboard)
                .as("Blackboard processor")
                .isInstanceOf(Blackboard.class)
                .isNotNull();
        }
    }
}
