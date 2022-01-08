package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.multiton.Multiton;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Multiton unit test
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
@Tag("creational")
@Tag("multiton")
@DisplayName("Test: multiton pattern")
@SpringBootTest
public class MultitonUTest {

    @Nested
    @Tag("creational")
    @Tag("multiton")
    @DisplayName("Test: multiton process")
    class MultitonTest {

        @Test
        @DisplayName("Test: multiton class")
        void patternIsCorrect() {

            assertThat(Multiton.class)
                .as("Multiton class")
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
        @DisplayName("Test: multiton instance")
        void processIsCorrect() {
            IPattern multiton = new Multiton();
            multiton.process();

            assertThat(multiton)
                .as("Multiton processor")
                .isInstanceOf(Multiton.class)
                .isNotNull();
        }
    }
}
