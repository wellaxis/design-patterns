package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.strategy.Strategy;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Strategy unit test
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Tag("behavioral")
@Tag("strategy")
@DisplayName("Test: strategy pattern")
@SpringBootTest
public class StrategyUTest {

    @Nested
    @Tag("behavioral")
    @Tag("strategy")
    @DisplayName("Test: strategy process")
    class StrategyTest {

        @Test
        @DisplayName("Test: strategy class")
        void patternIsCorrect() {

            assertThat(Strategy.class)
                .as("Strategy class")
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
        @DisplayName("Test: strategy instance")
        void processIsCorrect() {
            IPattern strategy = new Strategy();
            strategy.process();

            assertThat(strategy)
                .as("Strategy processor")
                .isInstanceOf(Strategy.class)
                .isNotNull();
        }
    }
}
