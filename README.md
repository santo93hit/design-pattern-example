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
    	  In this pattern we will not use 'if or switch' block for instantiating object. Implementation you can see in below path:- 
    	  https://github.com/santo93hit/design-pattern-example/tree/master/src/com/design/pattern/creational
	
	c.) Builder Pattern :- It's introduce to solve problem with Factory and Abstract Factory pattern. There are three major issues with these patterns:-
	     A.) To many parameter need to pass from client program to factory class due to this we might got some error. Most of the time type of arguments
	         are same. So, It's hard to maintain the order of arguments.
	     B.) Some of the parameters is optional, still we need to pass null value for that.
	     C.) If object is heavy and it's creation is complex, then all that complexity will be part of factory classes that is confusing. And object state will also be inconsistent.
	   
	    Builder pattern solve the issues with large number of optional parameters and inconsistent state by providing a way to build the object step-by-step and provide a method
	    that will actually return the final object. Implementation you can see in below path:- 
    	https://github.com/santo93hit/design-pattern-example/tree/master/src/com/design/pattern/creational
    	
    d.) Prototype Pattern :- It's getting used when object creation is costly, requires lots of time , resource and if you have similar object already existing.
        It will provide you a mechanism to copy the original object to a new object and then modify it according to your own use cases. It's using java cloning to copy the object.
        Prototype design pattern mandates that the Object which you are copying should provide the copying feature. It should not be done by any other class. However whether to use 
        shallow or deep copy of the Object properties depends on the requirements and its a design decision. Implementation you can see in below path:- 
    	https://github.com/santo93hit/design-pattern-example/tree/master/src/com/design/pattern/creational
        
         
	    
	       