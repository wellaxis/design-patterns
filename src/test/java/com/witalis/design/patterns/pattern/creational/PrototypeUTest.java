package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.prototype.Prototype;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Prototype unit test
 * User: Wellaxis
 * Date: 07.01.2022
 */
@Slf4j
@Tag("creational")
@Tag("prototype")
@DisplayName("Test: prototype pattern")
@SpringBootTest
public class PrototypeUTest {

    @Nested
    @Tag("creational")
    @Tag("prototype")
    @DisplayName("Test: prototype process")
    class PrototypeTest {

        @Test
        @DisplayName("Test: prototype class")
        void patternIsCorrect() {

            assertThat(Prototype.class)
                .as("Prototype class")
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
        @DisplayName("Test: prototype instance")
        void processIsCorrect() {
            IPattern prototype = new Prototype();
            prototype.process();

            assertThat(prototype)
                .as("Prototype processor")
                .isInstanceOf(Prototype.class)
                .isNotNull();
        }
    }
}
