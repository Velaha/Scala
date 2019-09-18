# Functionnal types

## Purpose

This exercice aims to move from object-oriented to functional. 
This will be done by one refactoring of the Car class to introduce functional approach.
 

## Todo :

*To reach our objective, you will find an implementation of Car's class in the package*  

### 1) Immutability is my friend

The first step of our refactoring would be to enforce the immutability. 

*Immutability is a central point in functional paradigm* 

Move all attributes from private/var to val declaration. 
Now we are allowed to read all attribute from outside of the instance. 


### 2) Master word : Pure

Currently implementation of both methods far from functional paradigm. why? 

    - Method modifies internal state of the instance
    - Method has no return value
    - Method is able to throw an exception
    
Whole of those points make the code no functional. 

We are going to walk through out some steps to make this code more functional. 
To achieve, we will use functional types that will help us in our quest.

**First step**, we are going to stop to modify the internal state (speed) of our Car. To achieve that, 
we now return a new Car with new computed speed. 

This is the signature of Car's methods : 

    def speedUp(s: Int): Car
    
    def brake(s: Int): Car
    
Each time you will change your speed, you will get a new reference on a new Car. 
**Modify and tests this new implementation**

**Second step**, next problem of the initial implementation is the exception throwed in case of wrong parameter. 
This kind of behavior break the execution flow and make things no determinist. **Either** functional type will be really usefull

This type contains two subType A and B: Either[A,B] to describe a failure or a success.
It is perfect for our needs. Then here we will introduce this type in methods' signature of Car's class.
  
  
    def speedUp(s: Int): Either[String,Car]
      
    def brake(s: Int): Either[String,Car]
    
Modify signatures and implement them. Integrate the pattern matching to handle the result (Success or failure) 

  
### 3) Car constructor


In section, We will use others kind of functional type : Option, List

    Info : We have modified the Car's signature. We replaced the `color:String` by a real type Color. 
    Currently we don't dive in details about this type.
    
Utility class CarConstructor is available in constructor's package.

In this exercice, you will search some specific car by its id (from 1 to 7). 

Once you found the Car, display the color of the car. 
Find a way to avoid any crash when Car isn't found (pattern matching, fold, etc..)

Now we looking for some Cars with the same color. 
Once you found some Car (or not), compute the whole number of places available.
Find a way to avoid any crash when Car isn't found (pattern matching, fold, etc..)
 
   
## Summary

In this section, you learned how make your code more functional by make thing immutable, typed (and without any exceptions).
Also, you worked with some functional types that allows you to describe what you want to do instead of write it (execution flow)
