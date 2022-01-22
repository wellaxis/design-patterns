package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.interpreter.Interpreter;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Interpreter unit test
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("interpreter")
@DisplayName("Test: interpreter pattern")
@SpringBootTest
public class InterpreterUTest {

    @Nested
    @Tag("behavioral")
    @Tag("interpreter")
    @DisplayName("Test: interpreter process")
    class InterpreterTest {

        @Test
        @DisplayName("Test: interpreter class")
        void patternIsCorrect() {

            assertThat(Interpreter.class)
                .as("Interpreter class")
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
        @DisplayName("Test: interpreter instance")
        void processIsCorrect() {
            IPattern interpreter = new Interpreter();
            interpreter.process();

            assertThat(interpreter)
                .as("Interpreter processor")
                .isInstanceOf(Interpreter.class)
                .isNotNull();
        }
    }
}
