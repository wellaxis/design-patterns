package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.chain.ChainResponsibility;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Chain of responsibility unit test
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("chain-of-responsibility")
@DisplayName("Test: chain of responsibility pattern")
@SpringBootTest
public class ChainResponsibilityUTest {

    @Nested
    @Tag("behavioral")
    @Tag("chain-of-responsibility")
    @DisplayName("Test: chain of responsibility process")
    class ChainResponsibilityTest {

        @Test
        @DisplayName("Test: chain of responsibility class")
        void patternIsCorrect() {

            assertThat(ChainResponsibility.class)
                .as("Chain of responsibility class")
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
        @DisplayName("Test: chain of responsibility instance")
        void processIsCorrect() {
            IPattern chainResponsibility = new ChainResponsibility();
            chainResponsibility.process();

            assertThat(chainResponsibility)
                .as("Chain of responsibility processor")
                .isInstanceOf(ChainResponsibility.class)
                .isNotNull();
        }
    }
}
