package com.witalis.design.patterns.pattern.behavioral;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.servant.Servant;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Servant unit test
 * User: Wellaxis
 * Date: 24.01.2022
 */
@Slf4j
@Tag("behavioral")
@Tag("servant")
@DisplayName("Test: servant pattern")
@SpringBootTest
public class ServantUTest {

    @Nested
    @Tag("behavioral")
    @Tag("servant")
    @DisplayName("Test: servant process")
    class ServantTest {

        @Test
        @DisplayName("Test: servant class")
        void patternIsCorrect() {

            assertThat(Servant.class)
                .as("Servant class")
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
        @DisplayName("Test: servant instance")
        void processIsCorrect() {
            IPattern servant = new Servant();
            servant.process();

            assertThat(servant)
                .as("Servant processor")
                .isInstanceOf(Servant.class)
                .isNotNull();
        }
    }
}
