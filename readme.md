#                        Design Patterns

Goal of project
---------------

> It is necessary to practice writing (realize & develop) 
> the different [design patterns][patterns] in examples:
> - Creational design patterns
> - Structural design patterns
> - Behavioral design patterns
> - Concurrency design patterns
> - Architectural design patterns
> - Anti design patterns
***

Installation
------------

It's required to set up application environment variables:
```sh
$ JAVA_HOME = [path]\java\jdk{version}
$ PATTERNS_HOME = [path]\design-patterns
```
***

## Benefits

> The main benefits from using design patterns are the following:
> 1. They are proven solutions
> 2. They are easily reusable
> 3. They are expressive
> 4. They ease communication
> 5. They prevent the need for refactoring code
> 6. They lower the size of the codebase
***

## Patterns
> **Software design pattern** - is a general, reusable solution
> to a commonly occurring problem within a given context in software design.

|                                            Name                                             | Description                                                                                                                           |
|:-------------------------------------------------------------------------------------------:|:--------------------------------------------------------------------------------------------------------------------------------------|
|    [Creational](/src/main/java/com/witalis/design/patterns/pattern/creational/readme.md)    | Provide the capability to create objects based on a required criterion and in a controlled way.                                       |
|    [Structural](/src/main/java/com/witalis/design/patterns/pattern/structural/readme.md)    | Ease the design by identifying a simple way to realize relationships among entities.                                                  |
|    [Behavioral](/src/main/java/com/witalis/design/patterns/pattern/behavioral/readme.md)    | Identify common communication patterns among objects. By doing so, these patterns increase flexibility in carrying out communication. |
|   [Concurrency](/src/main/java/com/witalis/design/patterns/pattern/concurrency/readme.md)   | Deal with the multithreaded programming paradigm. Use them increases concurrency in optimal way.                                      |
| [Architectural](/src/main/java/com/witalis/design/patterns/pattern/architectural/readme.md) | Reusable solutions to a commonly occurring problems in software architecture within a given context.                                  |
|          [Anti](/src/main/java/com/witalis/design/patterns/pattern/anti/readme.md)          | Common responses to a recurring problems that are usually ineffective and risks being highly counterproductive.                       |
***

Structure
---------

- patterns [root application directory]
    - bin [folder contains batch files]
    - log [folder contains module logs]
    - res [folder contains results of run]
    - src [folder contains source files]
    - configuration and documentation files
***

Framework
---------

Application uses a number of open source frameworks:
* [`slf4j`, `log4j`] - for application logging
* [`lombok`] - to generate class environment
* etc
***

[patterns]: <https://en.wikipedia.org/wiki/Software_design_pattern>
