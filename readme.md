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

`Creational` patterns
> Creational patterns - provide the capability to create objects
> based on a required criterion and in a controlled way.

|                                         Name                                          | Description                                                                                                                                                                      |                                                   Practice                                                   |
|:-------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------------:|
| [Simple Factory](https://en.wikipedia.org/wiki/Factory_(object-oriented_programming)) | Using factories instead of constructors or prototypes allows to use polymorphism for object creation, not only object use. Specifically, using factories provides encapsulation. |   [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/factory/simple/SimpleFactory.java)    |
|        [Factory Method](https://en.wikipedia.org/wiki/Factory_method_pattern)         | Define an interface for creating a single object, but let subclasses decide which class to instantiate. Factory Method lets a class defer instantiation to subclasses.           |   [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/factory/method/FactoryMethod.java)    |
|      [Abstract Factory](https://en.wikipedia.org/wiki/Abstract_factory_pattern)       | Provide an interface for creating families of related or dependent objects without specifying their concrete classes.                                                            | [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/factory/abstracts/AbstractFactory.java) |
|               [Builder](https://en.wikipedia.org/wiki/Builder_pattern)                | Separate the construction of a complex object from its representation, allowing the same construction process to create various representations.                                 |          [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/builder/Builder.java)          |
|             [Singleton](https://en.wikipedia.org/wiki/Singleton_pattern)              | Ensure a class has only one instance, and provide a global point of access to it.                                                                                                |        [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/singleton/Singleton.java)        |
|              [Multiton](https://en.wikipedia.org/wiki/Multiton_pattern)               | Ensure a class has only named instances, and provide a global point of access to them.                                                                                           |         [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/multiton/Multiton.java)         |
|             [Prototype](https://en.wikipedia.org/wiki/Prototype_pattern)              | Specify the kinds of objects to create using a prototypical instance, and create new objects from the 'skeleton' of an existing object.                                          |        [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/prototype/Prototype.java)        |
|       [Lazy Initialization](https://en.wikipedia.org/wiki/Lazy_initialization)        | Tactic of delaying the creation of an object, the calculation of a value, or some other expensive process until the first time it is needed.                                     |      [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/lazy/LazyInitialization.java)      |
|           [Object Pool](https://en.wikipedia.org/wiki/Object_pool_pattern)            | Avoid expensive acquisition and release of resources by recycling objects that are no longer in use.                                                                             |          [Java](/src/main/java/com/witalis/design/patterns/pattern/creational/pool/ObjectPool.java)          |

`Structural` patterns

|                           Name                           | Description                                                                                                                                                                |                                          Practice                                          |
|:--------------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------:|
|   [Proxy](https://en.wikipedia.org/wiki/Proxy_pattern)   | Provide a surrogate or placeholder for another object to control access to it.                                                                                             |   [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/proxy/Proxy.java)   |
| [Adapter](https://en.wikipedia.org/wiki/Adapter_pattern) | Convert the interface of a class into another interface clients expect. An adapter lets classes work together that could not otherwise because of incompatible interfaces. | [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/adapter/Adapter.java) |

`Behavioral` patterns

|                            Name                            | Description                                                                                                                                                                         |                                           Practice                                           |
|:----------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:--------------------------------------------------------------------------------------------:|
|  [Visitor](https://en.wikipedia.org/wiki/Visitor_pattern)  | Represent an operation to be performed on instances of a set of classes. Visitor lets a new operation be defined without changing the classes of the elements on which it operates. |  [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/visitor/Visitor.java)  |
| [Strategy](https://en.wikipedia.org/wiki/Strategy_pattern) | Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.                        | [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/strategy/Strategy.java) |
|    [State](https://en.wikipedia.org/wiki/State_pattern)    | Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.                                                                  |    [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/state/State.java)    |

`Concurrency` patterns

`Anti` patterns

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
