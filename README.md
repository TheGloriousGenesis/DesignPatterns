## Design Patterns

### Strategy Pattern
*Defines a family of algorithms, encapsulates each one and makes them interchangeable. 
Strategy lets the algorithm vary independently from clients that use it*

This is the same as saying that a class's behaviour can change at runtime.
In the example shown in this repo, the duck class having different implementations at runtime is a product
of this design pattern. Due to us programming to an interface (and not an implementation), we have successfully
implemented the Strategy Pattern! Notice how this pattern has **NOT** been used to implement the duck call object

