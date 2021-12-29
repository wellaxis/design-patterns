#                        Design Patterns

Goal of project
---------------

> It is necessary to practice writing (realize & develop) 
> the different [design patterns][patterns] in examples.
***

Installation
------------

It's required to set up application environment variables:
```sh
$ JAVA_HOME = [path]\java\jdk{version}
$ PATTERNS_HOME = [path]\design-patterns
```
***

## Patterns
> Software design pattern is a general,
> reusable solution to a commonly occurring problem
> within a given context in software design.

Creational patterns

|                                         Name                                          | Description                                                                                                                                                                      |                                             Practice                                             |
|:-------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------:|
| [Simple Factory](https://en.wikipedia.org/wiki/Factory_(object-oriented_programming)) | Using factories instead of constructors or prototypes allows to use polymorphism for object creation, not only object use. Specifically, using factories provides encapsulation. | [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/factory/SimpleFactory.java) |
|               [Builder](https://en.wikipedia.org/wiki/Builder_pattern)                | Separate the construction of a complex object from its representation, allowing the same construction process to create various representations.                                 |    [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/builder/Builder.java)    |

Structural patterns

|                           Name                           | Description                                                                                                                                                                |                                          Practice                                          |
|:--------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------:|
|   [Proxy](https://en.wikipedia.org/wiki/Proxy_pattern)   | Provide a surrogate or placeholder for another object to control access to it.                                                                                             |   [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/proxy/Proxy.java)   |
| [Adapter](https://en.wikipedia.org/wiki/Adapter_pattern) | Convert the interface of a class into another interface clients expect. An adapter lets classes work together that could not otherwise because of incompatible interfaces. | [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/adapter/Adapter.java) |

Behavioral patterns

|                           Name                           | Description                                                                                                                                                                         |                                          Practice                                          |
|:--------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------:|
| [Visitor](https://en.wikipedia.org/wiki/Visitor_pattern) | Represent an operation to be performed on instances of a set of classes. Visitor lets a new operation be defined without changing the classes of the elements on which it operates. | [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/visitor/Visitor.java) |

Concurrency patterns

Anti patterns

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
