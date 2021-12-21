package com.witalis.design.patterns.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource(
    value = "classpath:application.yml",
    ignoreResourceNotFound=true
)
@EnableAutoConfiguration
public class PatternConfig {
    private final Environment environment;

    @Autowired
    public PatternConfig(Environment environment) {
        this.environment = environment;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer placeHolderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
