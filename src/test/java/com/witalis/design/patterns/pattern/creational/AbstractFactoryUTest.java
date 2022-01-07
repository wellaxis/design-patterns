package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.factory.abstracts.AbstractFactory;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Abstract factory unit test
 * User: Wellaxis
 * Date: 31.12.2021
 */
@Slf4j
@Tag("creational")
@Tag("abstract-factory")
@DisplayName("Test: abstract factory pattern")
@SpringBootTest
public class AbstractFactoryUTest {

    @Nested
    @Tag("creational")
    @Tag("abstract-factory")
    @DisplayName("Test: abstract factory process")
    class AbstractFactoryTest {

        @Test
        @DisplayName("Test: abstract factory class")
        void patternIsCorrect() {

            assertThat(AbstractFactory.class)
                .as("Abstract factory class")
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
        @DisplayName("Test: abstract factory instance")
        void processIsCorrect() {
            IPattern abstractFactory = new AbstractFactory();
            abstractFactory.process();

            assertThat(abstractFactory)
                .as("Abstract factory processor")
                .isInstanceOf(AbstractFactory.class)
                .isNotNull();
        }
    }
}
