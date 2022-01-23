package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.command.Command;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Command unit test
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("command")
@DisplayName("Test: command pattern")
@SpringBootTest
public class CommandUTest {

    @Nested
    @Tag("behavioral")
    @Tag("command")
    @DisplayName("Test: command process")
    class CommandTest {

        @Test
        @DisplayName("Test: command class")
        void patternIsCorrect() {

            assertThat(Command.class)
                .as("Command class")
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
        @DisplayName("Test: command instance")
        void processIsCorrect() {
            IPattern command = new Command();
            command.process();

            assertThat(command)
                .as("Command processor")
                .isInstanceOf(Command.class)
                .isNotNull();
        }
    }
}
