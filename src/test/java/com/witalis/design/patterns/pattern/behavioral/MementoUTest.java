package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.memento.Memento;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Memento unit test
 * User: Wellaxis
 * Date: 17.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("memento")
@DisplayName("Test: memento pattern")
@SpringBootTest
public class MementoUTest {

    @Nested
    @Tag("behavioral")
    @Tag("memento")
    @DisplayName("Test: memento process")
    class MementoTest {

        @Test
        @DisplayName("Test: memento class")
        void patternIsCorrect() {

            assertThat(Memento.class)
                .as("Memento class")
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
        @DisplayName("Test: memento instance")
        void processIsCorrect() {
            IPattern memento = new Memento();
            memento.process();

            assertThat(memento)
                .as("Memento processor")
                .isInstanceOf(Memento.class)
                .isNotNull();
        }
    }
}
