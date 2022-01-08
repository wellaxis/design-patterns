package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.bridge.Bridge;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Bridge unit test
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Tag("structural")
@Tag("bridge")
@DisplayName("Test: bridge pattern")
@SpringBootTest
public class BridgeUTest {

    @Nested
    @Tag("structural")
    @Tag("bridge")
    @DisplayName("Test: bridge process")
    class BridgeTest {

        @Test
        @DisplayName("Test: bridge class")
        void patternIsCorrect() {

            assertThat(Bridge.class)
                .as("Bridge class")
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
        @DisplayName("Test: bridge instance")
        void processIsCorrect() {
            IPattern bridge = new Bridge();
            bridge.process();

            assertThat(bridge)
                .as("Bridge processor")
                .isInstanceOf(Bridge.class)
                .isNotNull();
        }
    }
}
