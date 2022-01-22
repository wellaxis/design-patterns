package com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Terminal Expression - Hashtag
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class BriefExpression extends TerminalExpression {
    public static final int MAX_LENGTH = 8;

    public BriefExpression(String definition) {
        super(definition);
    }

    @Override
    public boolean interpret(Context context) {
        if (context == null) return false;

        return getDefinition().length() <= MAX_LENGTH;
    }
}
