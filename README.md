# design-pattern-example

Design Pattern :- 
	It's an solution to general problems which software developers faced during application development. It is language independent. Here i will write all example in java.  

Need of Design Pattern :- 
	For solving a problem in a way by which will includes these factors :- 
	how to create a class, how to write a resuable code, how to intraction between objects, how to instantiate an object, how to make our code loosly coupled.

Benefits of Design Pattern :-
	Code reusability, Maintainable code, Loosely coupled code, Reduce cost of implementation

Types of Design Pattern :-
	1.) Creational :- It's deals with how to instantiate an object in the best possible way based on situation.
	
	2.) Structural :- It's deals with structure of the class like how to create a complex class using inheritance etc. So, we can get more benefits from those and code should
	 be more reusable.
	
	3.) Behavioral : It's deals with how objects will communicate each others and how to provide loose coupling between them. 
	
1.) Creational Design Pattern :-

	a.) Factory Pattern :- It will used when we have multiple subclass for a super class and based on input we need to instantiate object of one of the subclass.
		  We can implement factory pattern by using abstract class,interface or normal java class. This is one of the most widely used java design pattern. 
		  Implementation you can see in below path:-
		  https://github.com/santo93hit/design-pattern-example/tree/master/src/com/design/pattern/creational
		  
    b.) Abstract factory pattern :- This is similar to factory pattern , it's a factory of factories. In this one for each concrete class we will have factory class along with
    	  this we will have one abstract factory class which will instantiate object of concrete class based on respective factory class of the concrete class. Implementation
    	  In this pattern we will not use 'if or switch' block for instantiating object. You can see in below path:- 
    	  https://github.com/santo93hit/design-pattern-example/tree/master/src/com/design/pattern/creational
	
	c.) Builder Pattern :- 