package com.witalis.design.patterns.pattern.creational.builder.content;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.time.LocalDateTime;
import java.util.UUID;

/**
 * Desc: Account POJO
 * User: Wellaxis
 * Date: 25.12.2021
 */
@Slf4j
@Data
@EqualsAndHashCode
@ToString
public class Account {
    private UUID id;
    private String name;
    private double balance;
    private boolean active;
    private String comments;
    private LocalDateTime activation;

    /**
     * Constructor is private to use builder only.
     */
    private Account() {
        super();
    }

    /**
     * Static method to initialise builder to create account.
     * <p/>
     * @return the build builder instance
     */
    public static Builder builder() {
        return new Account().new Builder();
    }

    public class Builder {

        /**
         * Constructor should be private to avoid change account's fields.
         */
        private Builder() {
            super();
        }

        public Builder setId(UUID id) {
            Account.this.id = id;
            return this;
        }

        public Builder setName(String name) {
            Account.this.name = name;
            return this;
        }

        public Builder setBalance(double balance) {
            Account.this.balance = balance;
            return this;
        }

        public Builder setActive(boolean active) {
            Account.this.active = active;
            return this;
        }

        public Builder setComments(String comments) {
            Account.this.comments = comments;
            return this;
        }

        public Builder setActivation(LocalDateTime activation) {
            Account.this.activation = activation;
            return this;
        }

        /**
         * To return a specified account instance.
         * <p/>
         * @return the built account instance
         */
        public Account build() {
            return Account.this;
        }
    }
}
