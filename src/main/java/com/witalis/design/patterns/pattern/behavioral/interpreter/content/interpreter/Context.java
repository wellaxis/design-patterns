package com.witalis.design.patterns.pattern.behavioral.interpreter.content.interpreter;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * Desc: Context class
 * User: Wellaxis
 * Date: 22.01.2022
 */
@Slf4j
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Context {
    private String name;
    private List<String> characteristics;
}
