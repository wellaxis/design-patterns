package com.witalis.design.patterns.pattern.creational;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.creational.pool.ObjectPool;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Desc: Object pool unit test
 * User: Wellaxis
 * Date: 08.01.2022
 */
@Slf4j
@Tag("creational")
@Tag("object-pool")
@DisplayName("Test: object pool pattern")
@SpringBootTest
public class ObjectPoolUTest {

    @Nested
    @Tag("creational")
    @Tag("object-pool")
    @DisplayName("Test: object pool process")
    class ObjectPoolTest {

        @Test
        @DisplayName("Test: object pool class")
        void patternIsCorrect() {

            assertThat(ObjectPool.class)
                .as("Object pool class")
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
        @DisplayName("Test: object pool instance")
        void processIsCorrect() {
            IPattern objectPool = new ObjectPool();
            objectPool.process();

            assertThat(objectPool)
                .as("Object pool processor")
                .isInstanceOf(ObjectPool.class)
                .isNotNull();
        }
    }
}
