package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.marker.Marker;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Marker unit test
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Tag("structural")
@Tag("marker")
@DisplayName("Test: marker pattern")
@SpringBootTest
public class MarkerUTest {

    @Nested
    @Tag("structural")
    @Tag("marker")
    @DisplayName("Test: marker process")
    class MarkerTest {

        @Test
        @DisplayName("Test: marker class")
        void patternIsCorrect() {

            assertThat(Marker.class)
                .as("Marker class")
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
        @DisplayName("Test: marker instance")
        void processIsCorrect() {
            IPattern marker = new Marker();
            marker.process();

            assertThat(marker)
                .as("Marker processor")
                .isInstanceOf(Marker.class)
                .isNotNull();
        }
    }
}
