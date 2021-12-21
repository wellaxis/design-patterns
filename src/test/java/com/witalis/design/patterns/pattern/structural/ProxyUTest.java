package com.witalis.design.patterns.pattern.structural;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.*;

import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Proxy unit test
 * User: Wellaxis
 * Date: 21.12.2021
 */
@Slf4j
@Tag("structural")
@DisplayName("Test: proxy pattern")
@SpringBootTest
public class ProxyUTest {

    @Nested
    @Tag("structural")
    @Tag("proxy")
    @DisplayName("Test: proxy process")
    class InvokeTest {

        @Test
        @DisplayName("Test: proxy class")
        void patternIsCorrect() {

            assertThat(Proxy.class)
                .as("Proxy class")
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
        @DisplayName("Test: proxy instance")
        void invokeIsCorrect() {
            IPattern proxy = new Proxy();
            proxy.process();

            assertThat(proxy)
                .as("Proxy processor")
                .isInstanceOf(Proxy.class)
                .isNotNull();
        }
    }
}
