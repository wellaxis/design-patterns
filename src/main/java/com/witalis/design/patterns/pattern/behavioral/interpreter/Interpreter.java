package com.witalis.design.patterns.pattern.behavioral.interpreter;

import com.witalis.design.patterns.pattern.IPattern;
import com.witalis.design.patterns.pattern.behavioral.interpreter.content.InterpreterInvoker;
import com.witalis.design.patterns.utils.Classification;
import com.witalis.design.patterns.utils.Pattern;

import lombok.extern.slf4j.Slf4j;

/**
 * Desc: Interpreter pattern
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Pattern(
    name = "Interpreter",
    type = Classification.BEHAVIORAL,
    isClassical = true
)
public class Interpreter implements IPattern {

    /**
     * Definition:
     * -----------
     * Interpreter -> specifies how to evaluate sentences in a language.
     *     The basic idea is to have a class for each symbol (terminal or non-terminal)
     *     in a specialized computer language. The syntax tree of a sentence in the language
     *     is an instance of the composite pattern and is used to evaluate (interpret)
     *     the sentence for a client.
     *
     *     The client class refers to the common abstract expression interface
     *     for interpreting an expression interpret(context).
     *
     *     The terminal expression class has no children and interprets an expression directly.
     *
     *     The non-terminal expression class maintains a container of child expressions
     *     (expressions) and forwards interpret requests to these expressions.
     *
     * Algorithm:
     * ----------
     * 1. To create a common interface for set of entities.
     * 2. To create implementation classes based on common interface.
     * 3. To create a context class to process interpreting expressions.
     * 4. To create expression interface for interpreting context expressions.
     * 5. To create terminal & non-terminal implementations of expression interface.
     * 6. To add the interpreter method to expression interface and its realizations.
     *
     * Example:
     * --------
     * 1. Entity interface -> Device { void use(); }
     * 2. Entity classes -> Computer [Laptop, Mobile, Tablet], { void use(); }
     * 3. Context class -> Context { String name; List<String> characteristics; }
     * 4. Expression interface -> Expression { boolean interpret(Context context); }
     * 5. Expression classes -> Terminal [Brief, Hashtag, Holder] & Non-Terminal [All, Any, None]
     * 6. Interpreter method -> Expression { @Override boolean interpret(Context context); }
     */
    @Override
    public void process() {
        log.info("=================== Pattern[interpreter]: process ===============");
        var interpreter = new InterpreterInvoker();
        interpreter.invoke();
        log.info("=================================================================");
    }
}
