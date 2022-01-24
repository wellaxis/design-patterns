package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.data.PrivateClassData;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Private class data unit test
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Tag("structural")
@Tag("private-class-data")
@DisplayName("Test: private class data pattern")
@SpringBootTest
public class PrivateClassDataUTest {

    @Nested
    @Tag("structural")
    @Tag("private-class-data")
    @DisplayName("Test: private class data process")
    class PrivateClassDataTest {

        @Test
        @DisplayName("Test: private class data class")
        void patternIsCorrect() {

            assertThat(PrivateClassData.class)
                .as("private class data class")
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
        @DisplayName("Test: private class data instance")
        void processIsCorrect() {
            IPattern privateClassData = new PrivateClassData();
            privateClassData.process();

            assertThat(privateClassData)
                .as("private class data processor")
                .isInstanceOf(PrivateClassData.class)
                .isNotNull();
        }
    }
}
