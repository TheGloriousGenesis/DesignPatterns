## Design Patterns

### Strategy Pattern
>*Defines a family of algorithms, encapsulates each one and makes them interchangeable. 
Strategy lets the algorithm vary independently from clients that use it*

This is the same as saying that a class's behaviour can change at runtime.
In the example shown in this repo, the duck class having different implementations at runtime is a product
of this design pattern. Due to us programming to an interface (and not an implementation), we have successfully
implemented the Strategy Pattern! Notice how this pattern has **NOT** been used to implement the duck call object

Questions: 
1. What is meant by 'favour composition over inheritance?' 
2. Define what 'Algorithms' mean in the opening statement
3. What is a potential negative to using this pattern?

[Github markdown](https://guides.github.com/features/mastering-markdown/)


### Observer Pattern
>*Defines a one-to-many dependency between objects changes state, all its dependents are notified and updated 
automatically*

Pretty self explanatory, talks about the communication between objects in a loosely coupled way. What does loosely 
coupled mean? It means that the code you have written is resilient to change and is flexible. In the case of this repo, 
the subject (Weather station) knows nothing about the objects (display screens). The information that is getting shown 
on these screens means nothing to the weather station! Another important thing with the observer pattern is that the 
order in which observers are notified is random so do not depend on it! if certain information needs to be relayed 
in a certain order, DO NOT USE THIS!

Questions:
1. Name a situation where observer pattern could but should not be used?
2. Name 2 frameworks in Java which contains lots of Observers (be specific on observer pattern implementation)

### Decorator Pattern
>*Attach additional responsibilities to an object dynamically. Decorators provide a flexible alternative to subclassing 
for extending functionality*

A perfect example of the open-close principle which states that code should be close to modification but open for 
extension. As shown in the repo, extra ingredients can be created and added to an order without the need to edit the 
condiment class; this is also the same for the beverages and the beverage class. Decorators (in this case condiments) 
must mirror the classes that they are wrapping (in this case drinks). Decorators change the behaviour of the object 
they are wrapping by adding functionality to the object. The main issue with this pattern is that it creates many small 
complex objects which can grow and make the application over complicated.