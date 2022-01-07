package com.witalis.design.patterns.pattern.creational.builder.content.object;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Desc: Computer device
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Data
@ToString
@EqualsAndHashCode
public class Computer implements Device {
    private UUID id;
    private String name;
    private double price;
    private boolean active;
    private String comments;
    private LocalDateTime activation;

    /**
     * Constructor is private to use builder only.
     */
    private Computer() {
        super();
    }

    /**
     * Static method to initialise builder to create computer.
     * <p/>
     * @return the build builder instance
     */
    public static Computer.Builder builder() {
        return new Computer().new Builder();
    }

    public class Builder {

        /**
         * Constructor should be private to avoid change computer's fields.
         */
        private Builder() {
            super();
        }

        public Computer.Builder setId(UUID id) {
            Computer.this.id = id;
            return this;
        }

        public Computer.Builder setName(String name) {
            Computer.this.name = name;
            return this;
        }

        public Computer.Builder setPrice(double price) {
            Computer.this.price = price;
            return this;
        }

        public Computer.Builder setActive(boolean active) {
            Computer.this.active = active;
            return this;
        }

        public Computer.Builder setComments(String comments) {
            Computer.this.comments = comments;
            return this;
        }

        public Computer.Builder setActivation(LocalDateTime activation) {
            Computer.this.activation = activation;
            return this;
        }

        /**
         * To return a specified computer instance.
         * <p/>
         * @return the built computer instance
         */
        public Computer build() {
            return Computer.this;
        }
    }

    @Override
    public void use() {
        log.info("\t$ Computer '{}' is in use...", getName());
    }
}
