package com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter;

import java.util.List;

/**
 * Desc: Expression utilities
 * User: Wellaxis
 * Date: 23.01.2022
 */
public final class ExpressionUtils {

    private ExpressionUtils() {
        super();
    }

    public static Expression initWorkExpression() {
        Expression secure = new HolderExpression("Secure");
        Expression software = new BriefExpression("Software");
        Expression server = new HashtagExpression("#server");

        return new AllExpression(List.of(secure, software, server));
    }

    public static Expression initGameExpression() {
        Expression bought = new BriefExpression("Just bought!");
        Expression crypto = new HashtagExpression("#crypto");
        Expression expensive = new HolderExpression("Expensive");

        return new AnyExpression(List.of(bought, crypto, expensive));
    }

    public static Expression initHomeExpression() {
        Expression middle = new HashtagExpression("#middle");
        Expression credit = new HolderExpression("credit");
        Expression current = new BriefExpression("For now");

        return new NoneExpression(List.of(middle, credit, current));
    }
}
