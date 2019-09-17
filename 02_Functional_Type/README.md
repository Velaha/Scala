# Classes

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


(
-- replace Unit by Car in case of success (comme tous est immutable on recré une nouvelle voiture
-- On veut pouvoir gérer les erreurs sans casser le flow d'execution : Either

) 

  
### 3) Car constructor

On va maintenant produire et vendre des voitures. Dans le package garage, vous trouverez une implémentation vide d'un constructeur de voiture. 
L'idée est de pouvoir rechercher des voitures dans le ga
 

   
## summary

