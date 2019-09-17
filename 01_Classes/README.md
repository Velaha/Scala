# Classes

## Purpose

Exercice aims to be familiar with the basic class creation. Paradigm behind exercice is actually Object Oriented

## Todo : 

### 1) First class 

Declare one classe name `Car` in package 

    com.td.scala.classes


Voiture's class must have 3 attributs : 

    - nbDoor - Int : private
    - color - String : mutable
    - nbPlaces - Int : immutable
    - speed - Int : mutable (default value = 0)
    
    
### 2) Second constructor
 
Modify Car's class to add second constructor that has only one parameter (color),
others parameters must be initialized with defaults values (nbDoor:2 and nbPlaces: 2)
    

### 3) add methods 

Here, we are going to add two methods :  

        speedUp : one parameter will indicate the number of km/h that the speed  of the car will be increase, parameter
         must be exclusively positive
        if not, throw an `IllegalArgumentException`. Method returns Unit
    
    
        brake : One parameter will indicate the number of km/h that the speed of the car will be decrease,
         parameter must be exclusively negative if not, throw an IllegalArgumentException. Method returns Unit
         
   *(Speed must be hold internally in mutable variable and readable from outside the class)*
   
### 4) Start your car


Create one runnable class. 
Instanciate one car, with primary constructor and after one with secondary constructor

Drive your cars, accelerate, brake, check speed... test error cases also. 


   
## summary

Here we saw how create one class in Scala language and how declare some methods. In this implemetation,
we used the object oriented paradigm by used the exception and used the mutable internal state. 
Next exercice will show you how we can change our approach and be more functional