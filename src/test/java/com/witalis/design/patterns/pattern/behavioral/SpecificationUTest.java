package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.specification.Specification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Specification unit test
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("specification")
@DisplayName("Test: specification pattern")
@SpringBootTest
public class SpecificationUTest {

    @Nested
    @Tag("behavioral")
    @Tag("specification")
    @DisplayName("Test: specification process")
    class SpecificationTest {

        @Test
        @DisplayName("Test: specification class")
        void patternIsCorrect() {

            assertThat(Specification.class)
                .as("Specification class")
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
        @DisplayName("Test: specification instance")
        void processIsCorrect() {
            IPattern specification = new Specification();
            specification.process();

            assertThat(specification)
                .as("Specification processor")
                .isInstanceOf(Specification.class)
                .isNotNull();
        }
    }
}
