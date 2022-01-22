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
public class HashtagExpression extends TerminalExpression {
    public static final String HASH_SYMBOL = "#";

    public HashtagExpression(String definition) {
        super(definition);
    }

    @Override
    public boolean interpret(Context context) {
        if (context == null) return false;

        return getDefinition().startsWith(HASH_SYMBOL);
    }
}
