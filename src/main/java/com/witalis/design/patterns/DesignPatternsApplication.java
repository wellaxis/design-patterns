package com.witalis.design.patterns;

import lombok.EqualsAndHashCode;
import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.Banner;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

/**
 * Desc: Java Design - Patterns
 * User: Wellaxis
 * Date: 2021/12/21
 */
@Slf4j
@SpringBootApplication
@EqualsAndHashCode(callSuper=false)
@ConfigurationPropertiesScan
public class DesignPatternsApplication {

    public static void main(String... args) {
        new SpringApplicationBuilder()
            .sources(DesignPatternsApplication.class)
            .bannerMode(Banner.Mode.LOG)
            .web(WebApplicationType.NONE)
            .headless(false)
            .run(args);
    }
}
