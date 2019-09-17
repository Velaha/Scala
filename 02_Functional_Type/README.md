# Functionnal types

## Purpose

Exercice aims move from the oriented object paradigm to functional paradigm. 
This move will be done by one refactoring of the Car class to introduce functional approach.
 

## Todo :

*To reach our objective, you will find an implementation of Car class in the package*  

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


In section, We will use other kind of functional type : Option

On va maintenant produire et vendre des voitures. Dans le package garage, vous trouverez une implémentation vide d'un constructeur de voiture. 
L'idée est de pouvoir rechercher des voitures dans le ga
 

   
## summary

