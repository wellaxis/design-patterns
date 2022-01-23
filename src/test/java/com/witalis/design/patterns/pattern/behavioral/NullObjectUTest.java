package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.nulls.NullObject;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Null object unit test
 * User: Wellaxis
 * Date: 23.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("null-object")
@DisplayName("Test: null object pattern")
@SpringBootTest
public class NullObjectUTest {

    @Nested
    @Tag("behavioral")
    @Tag("null-object")
    @DisplayName("Test: null object process")
    class NullObjectTest {

        @Test
        @DisplayName("Test: null object class")
        void patternIsCorrect() {

            assertThat(NullObject.class)
                .as("Null object class")
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
        @DisplayName("Test: null object instance")
        void processIsCorrect() {
            IPattern nullObject = new NullObject();
            nullObject.process();

            assertThat(nullObject)
                .as("Null object processor")
                .isInstanceOf(NullObject.class)
                .isNotNull();
        }
    }
}
