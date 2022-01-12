package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.composite.Composite;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Composite unit test
 * User: Wellaxis
 * Date: 12.01.2022
 */
@Slf4j
@Tag("structural")
@Tag("composite")
@DisplayName("Test: composite pattern")
@SpringBootTest
public class CompositeUTest {

    @Nested
    @Tag("structural")
    @Tag("composite")
    @DisplayName("Test: composite process")
    class CompositeTest {

        @Test
        @DisplayName("Test: composite class")
        void patternIsCorrect() {

            assertThat(Composite.class)
                .as("Composite class")
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
        @DisplayName("Test: composite instance")
        void processIsCorrect() {
            IPattern composite = new Composite();
            composite.process();

            assertThat(composite)
                .as("Composite processor")
                .isInstanceOf(Composite.class)
                .isNotNull();
        }
    }
}
