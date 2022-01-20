package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.observer.Observer;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Observer unit test
 * User: Wellaxis
 * Date: 20.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("observer")
@DisplayName("Test: observer pattern")
@SpringBootTest
public class ObserverUTest {

    @Nested
    @Tag("behavioral")
    @Tag("observer")
    @DisplayName("Test: observer process")
    class ObserverTest {

        @Test
        @DisplayName("Test: observer class")
        void patternIsCorrect() {

            assertThat(Observer.class)
                .as("Observer class")
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
        @DisplayName("Test: observer instance")
        void processIsCorrect() {
            IPattern observer = new Observer();
            observer.process();

            assertThat(observer)
                .as("Observer processor")
                .isInstanceOf(Observer.class)
                .isNotNull();
        }
    }
}
