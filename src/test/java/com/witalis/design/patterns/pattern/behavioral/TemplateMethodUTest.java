package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.template.TemplateMethod;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Template method unit test
 * User: Wellaxis
 * Date: 19.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("template-method")
@DisplayName("Test: template method pattern")
@SpringBootTest
public class TemplateMethodUTest {

    @Nested
    @Tag("behavioral")
    @Tag("template-method")
    @DisplayName("Test: template method process")
    class TemplateMethodTest {

        @Test
        @DisplayName("Test: template method class")
        void patternIsCorrect() {

            assertThat(TemplateMethod.class)
                .as("Template method class")
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
        @DisplayName("Test: template method instance")
        void processIsCorrect() {
            IPattern templateMethod = new TemplateMethod();
            templateMethod.process();

            assertThat(templateMethod)
                .as("Template method processor")
                .isInstanceOf(TemplateMethod.class)
                .isNotNull();
        }
    }
}
