package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.visitor.Visitor;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Visitor unit test
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Tag("behavioral")
@Tag("visitor")
@DisplayName("Test: visitor pattern")
@SpringBootTest
public class VisitorUTest {

    @Nested
    @Tag("behavioral")
    @Tag("visitor")
    @DisplayName("Test: visitor process")
    class VisitorTest {

        @Test
        @DisplayName("Test: visitor class")
        void patternIsCorrect() {

            assertThat(Visitor.class)
                .as("Visitor class")
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
        @DisplayName("Test: visitor instance")
        void processIsCorrect() {
            IPattern visitor = new Visitor();
            visitor.process();

            assertThat(visitor)
                .as("Visitor processor")
                .isInstanceOf(Visitor.class)
                .isNotNull();
        }
    }
}
