package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.iterator.Iterator;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Iterator unit test
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("iterator")
@DisplayName("Test: iterator pattern")
@SpringBootTest
public class IteratorUTest {

    @Nested
    @Tag("behavioral")
    @Tag("iterator")
    @DisplayName("Test: iterator process")
    class IteratorTest {

        @Test
        @DisplayName("Test: iterator class")
        void patternIsCorrect() {

            assertThat(Iterator.class)
                .as("Iterator class")
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
        @DisplayName("Test: iterator instance")
        void processIsCorrect() {
            IPattern iterator = new Iterator();
            iterator.process();

            assertThat(iterator)
                .as("Iterator processor")
                .isInstanceOf(Iterator.class)
                .isNotNull();
        }
    }
}
