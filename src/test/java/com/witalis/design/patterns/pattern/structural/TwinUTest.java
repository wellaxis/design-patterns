package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.structural.twin.Twin;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Twin unit test
 * User: Wellaxis
 * Date: 15.01.2022
 */
@Slf4j
@Tag("structural")
@Tag("twin")
@DisplayName("Test: twin pattern")
@SpringBootTest
public class TwinUTest {

    @Nested
    @Tag("structural")
    @Tag("twin")
    @DisplayName("Test: twin process")
    class TwinTest {

        @Test
        @DisplayName("Test: twin class")
        void patternIsCorrect() {

            assertThat(Twin.class)
                .as("Twin class")
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
        @DisplayName("Test: twin instance")
        void processIsCorrect() {
            IPattern twin = new Twin();
            twin.process();

            assertThat(twin)
                .as("Twin processor")
                .isInstanceOf(Twin.class)
                .isNotNull();
        }
    }
}
