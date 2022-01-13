package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.facade.Facade;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Facade unit test
 * User: Wellaxis
 * Date: 13.01.2022
 */
@Slf4j
@Tag("structural")
@Tag("facade")
@DisplayName("Test: facade pattern")
@SpringBootTest
public class FacadeUTest {

    @Nested
    @Tag("structural")
    @Tag("facade")
    @DisplayName("Test: facade process")
    class FacadeTest {

        @Test
        @DisplayName("Test: facade class")
        void patternIsCorrect() {

            assertThat(Facade.class)
                .as("Facade class")
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
        @DisplayName("Test: facade instance")
        void processIsCorrect() {
            IPattern facade = new Facade();
            facade.process();

            assertThat(facade)
                .as("Facade processor")
                .isInstanceOf(Facade.class)
                .isNotNull();
        }
    }
}
