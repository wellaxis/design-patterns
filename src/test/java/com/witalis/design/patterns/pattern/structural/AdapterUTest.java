package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.adapter.Adapter;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Adapter unit test
 * User: Wellaxis
 * Date: 29.12.2021
 */
@Slf4j
@Tag("structural")
@Tag("adapter")
@DisplayName("Test: adapter pattern")
@SpringBootTest
public class AdapterUTest {

    @Nested
    @Tag("structural")
    @Tag("adapter")
    @DisplayName("Test: adapter process")
    class AdapterTest {

        @Test
        @DisplayName("Test: adapter class")
        void patternIsCorrect() {

            assertThat(Adapter.class)
                .as("Adapter class")
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
        @DisplayName("Test: adapter instance")
        void processIsCorrect() {
            IPattern adapter = new Adapter();
            adapter.process();

            assertThat(adapter)
                .as("Adapter processor")
                .isInstanceOf(Adapter.class)
                .isNotNull();
        }
    }
}
