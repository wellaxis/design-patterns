package com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Terminal Expression - Holder
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class HolderExpression extends TerminalExpression {

    public HolderExpression(String definition) {
        super(definition);
    }

    @Override
    public boolean interpret(Context context) {
        if (context == null) return false;
        return context.getCharacteristics().contains(getDefinition());
    }
}
