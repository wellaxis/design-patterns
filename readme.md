#                        Design Patterns

Goal of project
---------------

> It is necessary to practice writing (realize & develop) 
> the different [design patterns][patterns] in examples.
***

Installation
------------

It's required to setup application environment variable:
```sh
$ JAVA_HOME = [path]\java\jdk{version}
```
***

## Patterns
> Software design pattern is a general,
> reusable solution to a commonly occurring problem
> within a given context in software design.

Creational patterns

Structural patterns

| Name                                                 | Description                                                                    |
|:-----------------------------------------------------|:-------------------------------------------------------------------------------|
| [Proxy](https://en.wikipedia.org/wiki/Proxy_pattern) | Provide a surrogate or placeholder for another object to control access to it. |

Behavioral patterns

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
