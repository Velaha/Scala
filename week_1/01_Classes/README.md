# Classes

## Purpose

This first exercise will help you to get more familiar with the basic creation of a _class_.
It is a very short exercise, do it purely Object-oriented ("Java's style"), we will iterate on it in the following exercise.

## Todo : 

### 1) First class 

Declare one class name `Car` in package 

    com.td.scala.classes


The class _Car_ must have 3 attributes : 

    - nbDoor - Int : private
    - color - String : mutable
    - nbPlaces - Int : immutable
    - speed - Int : mutable (default value = 0)
    
### 2) add methods 

Here, we are going to add two methods :  

        speedUp : one parameter will indicate the number of km/h that the speed of the car will be increase, parameter
         must be exclusively positive
        if not, throw an `IllegalArgumentException`. Method returns Unit
    
    
        brake : One parameter will indicate the number of km/h that the speed of the car will be decrease,
         parameter must be exclusively negative if not, throw an IllegalArgumentException. Method returns Unit
         
   *(Speed must be hold internally in mutable variable and readable from outside the class)*
   
### 3) Start your car


Create one runnable class. 
Instantiate one car, with primary constructor and after one with secondary constructor

Drive your cars, accelerate, brake, check speed... test error cases also. 

## Summary

Here we saw how create one class in Scala language and how declare some methods. In this implementation,
we used the object oriented paradigm by used the exception and used the mutable internal state. 
Following exercise will show you how we can change our approach and be more functional.
