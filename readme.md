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
> Software design pattern is a general,
> reusable solution to a commonly occurring problem
> within a given context in software design.

|                                         Name                                          | Description                                                                                                     |
|:-------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------------------------------------------|
| [Creational](/src/main/java/com/witalis/design/patterns/pattern/creational/readme.md) | Provide the capability to create objects based on a required criterion and in a controlled way.                 |
|       [Anti](/src/main/java/com/witalis/design/patterns/pattern/anti/readme.md)       | Common responses to a recurring problems that are usually ineffective and risks being highly counterproductive. |

***

`Structural` patterns
> Structural design patterns - to ease the design by identifying a simple way
> to realize relationships among entities.

|  ID |                                    Name                                    | Description                                                                                                                                                                   |                                             Practice                                             |
|----:|:--------------------------------------------------------------------------:|:------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------:|
|   1 |            [Proxy](https://en.wikipedia.org/wiki/Proxy_pattern)            | Provide a surrogate or placeholder for another object to control access to it.                                                                                                |      [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/proxy/Proxy.java)      |
|   2 |          [Adapter](https://en.wikipedia.org/wiki/Adapter_pattern)          | Convert the interface of a class into another interface clients expect. An adapter lets classes work together that could not otherwise because of incompatible interfaces.    |    [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/adapter/Adapter.java)    |
|   3 |           [Bridge](https://en.wikipedia.org/wiki/Bridge_pattern)           | Decouple an abstraction from its implementation allowing the two to vary independently.                                                                                       |     [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/bridge/Bridge.java)     |
|   4 |           [Facade](https://en.wikipedia.org/wiki/Facade_pattern)           | Provide a unified interface to a set of interfaces in a subsystem. Facade defines a higher-level interface that makes the subsystem easier to use.                            |     [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/facade/Facade.java)     |
|   5 |        [Composite](https://en.wikipedia.org/wiki/Composite_pattern)        | Compose objects into tree structures to represent part-whole hierarchies. Composite lets clients treat individual objects and compositions of objects uniformly.              |  [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/composite/Composite.java)  |
|   6 |        [Decorator](https://en.wikipedia.org/wiki/Decorator_pattern)        | Attach additional responsibilities to an object dynamically keeping the same interface. Decorators provide a flexible alternative to subclassing for extending functionality. |  [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/decorator/Decorator.java)  |
|   7 |        [Flyweight](https://en.wikipedia.org/wiki/Flyweight_pattern)        | Use sharing to support large numbers of similar objects efficiently.                                                                                                          |  [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/flyweight/Flyweight.java)  |
|   8 |             [Twin](https://en.wikipedia.org/wiki/Twin_pattern)             | Twin allows modeling of multiple inheritance in programming languages that do not support this feature.                                                                       |       [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/twin/Twin.java)       |
|   9 |      [Marker](https://en.wikipedia.org/wiki/Marker_interface_pattern)      | Empty interface to associate metadata with a class.                                                                                                                           |     [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/marker/Marker.java)     |
|  10 | [Private Class Data](https://handwiki.org/wiki/Private_class_data_pattern) | Using to encapsulate class attributes and their manipulation.                                                                                                                 | [Java](/src/main/java/com/witalis/design/patterns/pattern/structural/data/PrivateClassData.java) |
***

`Behavioral` patterns
> Behavioral design patterns - to identify common communication patterns among objects.
> By doing so, these patterns increase flexibility in carrying out communication.

|  ID |                                           Name                                           | Description                                                                                                                                                                                                        |                                                Practice                                                |
|----:|:----------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|:------------------------------------------------------------------------------------------------------:|
|   1 |                 [Visitor](https://en.wikipedia.org/wiki/Visitor_pattern)                 | Represent an operation to be performed on instances of a set of classes. Visitor lets a new operation be defined without changing the classes of the elements on which it operates.                                |       [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/visitor/Visitor.java)       |
|   2 |                [Strategy](https://en.wikipedia.org/wiki/Strategy_pattern)                | Define a family of algorithms, encapsulate each one, and make them interchangeable. Strategy lets the algorithm vary independently from clients that use it.                                                       |      [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/strategy/Strategy.java)      |
|   3 |                   [State](https://en.wikipedia.org/wiki/State_pattern)                   | Allow an object to alter its behavior when its internal state changes. The object will appear to change its class.                                                                                                 |         [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/state/State.java)         |
|   4 |                 [Command](https://en.wikipedia.org/wiki/Command_pattern)                 | Encapsulate a request as an object, thereby allowing for the parameterization of clients with different requests, and the queuing or logging of requests.                                                          |       [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/command/Command.java)       |
|   5 |                 [Memento](https://en.wikipedia.org/wiki/Memento_pattern)                 | Without violating encapsulation, capture and externalize an object's internal state allowing the object to be restored to this state later.                                                                        |       [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/memento/Memento.java)       |
|   6 |                [Observer](https://en.wikipedia.org/wiki/Observer_pattern)                | Define a one-to-many dependency between objects where a state change in one object results in all its dependents being notified and updated automatically.                                                         |      [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/observer/Observer.java)      |
|   7 |                [Mediator](https://en.wikipedia.org/wiki/Mediator_pattern)                | Define an object that encapsulates how a set of objects interact. Mediator promotes loose coupling by keeping objects from referring to each other explicitly (it allows their independent interaction).           |      [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/mediator/Mediator.java)      |
|   8 |                [Iterator](https://en.wikipedia.org/wiki/Iterator_pattern)                | Provide a way to access the elements of an aggregate object sequentially without exposing its underlying representation.                                                                                           |      [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/iterator/Iterator.java)      |
|   9 |             [Iterpreter](https://en.wikipedia.org/wiki/Interpreter_pattern)              | Given a language, define a representation for its grammar along with an interpreter that uses the representation to interpret sentences in the language.                                                           |   [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/interpreter/Interpreter.java)   |
|  10 |         [Template Method](https://en.wikipedia.org/wiki/Template_method_pattern)         | Define the skeleton of an algorithm in an operation, deferring some steps to subclasses. Template method lets subclasses redefine certain steps of an algorithm without changing the algorithm's structure.        |   [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/template/TemplateMethod.java)   |
|  11 | [Chain of Responsibility](https://en.wikipedia.org/wiki/Chain-of-responsibility_pattern) | Avoid coupling the sender of a request to its receiver by giving more than one object a chance to handle the request. Chain the receiving objects and pass the request along the chain until an object handles it. |  [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/chain/ChainResponsibility.java)  |
|  12 |             [Null Object](https://en.wikipedia.org/wiki/Null_object_pattern)             | Avoid null references by providing a default object.                                                                                                                                                               |      [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/nulls/NullObject.java)       |
|  13 |           [Specification](https://en.wikipedia.org/wiki/Specification_pattern)           | Recombinable business logic in a Boolean fashion.                                                                                                                                                                  | [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/specification/Specification.java) |
|  14 |            [Servant](https://en.wikipedia.org/wiki/Servant_(design_pattern))             | Define common functionality for a group of classes. The servant pattern is also frequently called helper class or utility class implementation for a given set of classes.                                         |       [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/servant/Servant.java)       |
|  15 |         [Blackboard](https://en.wikipedia.org/wiki/Blackboard_(design_pattern))          | Provide a computational framework for the design and implementation of systems that integrate large and diverse specialized modules, and implement complex, non-deterministic control strategies.                  |    [Java](/src/main/java/com/witalis/design/patterns/pattern/behavioral/blackboard/Blackboard.java)    |
***

`Concurrency` patterns
> Concurrency design patterns - are deal with the multithreaded programming paradigm.

|  ID |                                           Name                                           | Description                                                                                                                                                                                                        |
|----:|:----------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|   1 |               [Active Object](https://en.wikipedia.org/wiki/Active_object)               | Decouples method execution from method invocation that reside in their own thread of control. The goal is to introduce concurrency, by using asynchronous method invocation and a scheduler for handling requests. |
|   2 |             [Balking pattern](https://en.wikipedia.org/wiki/Balking_pattern)             | Only execute an action on an object when the object is in a particular state.                                                                                                                                      |
|   3 |           [Barrier](https://en.wikipedia.org/wiki/Barrier_(computer_science))            | A barrier for a group of threads or processes in the source code means any thread/process must stop at this point and cannot proceed until all other threads/processes reach this barrier.                         |
|   4 |      [Double-checked locking](https://en.wikipedia.org/wiki/Double-checked_locking)      | Reduce the overhead of acquiring a lock by first testing the locking criterion (the 'lock hint') in an unsafe manner; only if that succeeds does the actual locking logic proceed.                                 |
|   5 |          [Guarded suspension](https://en.wikipedia.org/wiki/Guarded_suspension)          | Manages operations that require both a lock to be acquired and a precondition to be satisfied before the operation can be executed.                                                                                |
|   6 |        [Monitor Object](https://en.wikipedia.org/wiki/Monitor_(synchronization))         | An object whose methods are subject to mutual exclusion, thus preventing multiple objects from erroneously trying to use it at the same time.                                                                      |
|   7 |                 [Reactor](https://en.wikipedia.org/wiki/Reactor_pattern)                 | A reactor object provides an asynchronous interface to resources that must be handled synchronously.                                                                                                               |
|   8 |       [Read-write lock](https://en.wikipedia.org/wiki/Readers%E2%80%93writer_lock)       | Allows concurrent read access to an object, but requires exclusive access for write operations. An underlying semaphore might be used for writing, and a Copy-on-write mechanism may or may not be used.           |
|   9 |            [Scheduler](https://en.wikipedia.org/wiki/Scheduling_(computing))             | Explicitly control when threads may execute single-threaded code.                                                                                                                                                  |
|  10 |                 [Thread pool](https://en.wikipedia.org/wiki/Thread_pool)                 | A number of threads are created to perform a number of tasks, which are usually organized in a queue. Typically, there are many more tasks than threads.                                                           |
|  11 |        [Thread-local storage](https://en.wikipedia.org/wiki/Thread-local_storage)        | A computer programming method that uses static or global memory local to a thread (TLS).                                                                                                                           |
|  12 |                    [Join](https://en.wikipedia.org/wiki/Join-pattern)                    | Join-pattern provides a way to write concurrent, parallel and distributed programs by message passing. Compared to the use of threads and locks, this is a high-level programming model.                           |
|  13 |              [Lock](https://en.wikipedia.org/wiki/Lock_(computer_science))               | One thread puts a "lock" on a resource, preventing other threads from accessing or modifying it.                                                                                                                   |
|  14 |               [Messaging](https://en.wikipedia.org/wiki/Messaging_pattern)               | Allows the interchange of information (i.e. messages) between components and applications.                                                                                                                         |
|  15 | [Event-based asynchronous](https://en.wikipedia.org/wiki/Asynchronous_method_invocation) | Addresses problems with the asynchronous pattern that occur in multithreaded programs.                                                                                                                             |
***

`Architectural` patterns
> Architectural design patterns - reusable solutions to a commonly occurring problems
> in software architecture within a given context. The architectural patterns address
> various issues in software engineering, such as computer hardware performance limitations,
> high availability and minimization of a business risk.
> Some architectural patterns have been implemented within software frameworks.

|  ID |                                               Name                                               | Description                                                                                                                                                                                                                                            |
|----:|:------------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
|   1 |     [Object-oriented programming](https://en.wikipedia.org/wiki/Object-oriented_programming)     | A programming paradigm based on the concept of "objects", which can contain data and code: data in the form of fields (often known as attributes or properties), and code, in the form of procedures (often known as methods).                         |
|   2 |              [Layers](https://en.wikipedia.org/wiki/Layer_(object-oriented_design))              | A layer is a group of classes that have the same set of link-time module dependencies to other modules. In other words, a layer is a group of reusable components that are reusable in similar circumstances.                                          |
|   3 |                      [Broker](https://en.wikipedia.org/wiki/Broker_pattern)                      | Can be used to structure distributed software systems with decoupled components that interact by remote procedure calls.                                                                                                                               |
|   4 |       [Event-driven architecture](https://en.wikipedia.org/wiki/Event-driven_architecture)       | A software architecture paradigm promoting the production, detection, consumption of, and reaction to events.                                                                                                                                          |
|   5 | [Action–domain–responder](https://en.wikipedia.org/wiki/Action%E2%80%93domain%E2%80%93responder) | A refinement of Model–view–controller (MVC) that is better suited for web applications. Different styles: MVC, PAC, MVP, MVVM, etc.                                                                                                                    |
|   6 |                   [Microservices](https://en.wikipedia.org/wiki/Microservices)                   | Arranges an application as a collection of loosely-coupled services. In a microservices architecture, services are fine-grained and the protocols are lightweight.                                                                                     |
|   7 |    [Hexagonal architecture](https://en.wikipedia.org/wiki/Hexagonal_architecture_(software))     | It aims at creating loosely coupled application components that can be easily connected to their software environment by means of ports and adapters. This makes components exchangeable at any level and facilitates test automation.                 |
|   8 |          [Multitier architecture](https://en.wikipedia.org/wiki/Multitier_architecture)          | A client–server architecture in which presentation, application processing and data management functions are physically separated. The most widespread use of multitier architecture is the three-tier architecture.                                   |
|   9 |   [Service-oriented architecture](https://en.wikipedia.org/wiki/Service-oriented_architecture)   | SOA is an architectural style that supports service orientation. It is as well applied in the field of software design where services are provided to the other components by application components, through a communication protocol over a network. |
|  10 |         [Entity component system](https://en.wikipedia.org/wiki/Entity_component_system)         | An ECS follows the principle of composition over inheritance, meaning that every entity is defined not by a "type", but by the components that are associated with it.                                                                                 |
|  11 |                    [Peer-to-peer](https://en.wikipedia.org/wiki/Peer-to-peer)                    | P2P is a distributed application architecture that partitions tasks or workloads between peers. Peers are equally privileged, equipotent participants in the application. They are said to form a peer-to-peer network of nodes.                       |
|  12 |        [Pipe and filter architecture](https://en.wikipedia.org/wiki/Pipeline_(software))         | A pipeline consists of a chain of processing elements (processes, threads, coroutines, functions, etc.), arranged so that the output of each element is the input of the next; the name is by analogy to a physical pipeline.                          |
|  13 |          [Distributed hash table](https://en.wikipedia.org/wiki/Distributed_hash_table)          | DHT is a distributed system that provides a lookup service similar to a hash table: key-value pairs are stored in a DHT, and any participating node can efficiently retrieve the value associated with a given key.                                    |
|  14 |                   [Naked objects](https://en.wikipedia.org/wiki/Naked_objects)                   | All business logic should be encapsulated onto the domain objects. The user interface should be a direct representation of the domain objects. The UI shall be entirely automatically created from the definitions of the domain objects.              |
|  15 |          [Operational data store](https://en.wikipedia.org/wiki/Operational_data_store)          | ODS is used for operational reporting and as a source of data for the enterprise data warehouse. It is a complementary element to an EDW in a decision support landscape, and is used for operational reporting, controls, etc.                        |
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
