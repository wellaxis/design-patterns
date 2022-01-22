package com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Desc: Non Terminal Expression - Any
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class AnyExpression extends NonTerminalExpression {

    public AnyExpression(List<Expression> expressions) {
        super(expressions);
    }

    @Override
    public boolean interpret(Context context) {
        for (Expression expression: getExpressions()) {
            var interpretation = expression.interpret(context);
            if (interpretation) return true;
        }
        return false;
    }
}
