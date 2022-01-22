package com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc:
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public abstract class TerminalExpression implements Expression {
    private String definition;
}
