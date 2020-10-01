# Classes

## Purpose

This first exercise will help you to get more familiar with the basic creation of a _class_.

It is a very short exercise, do it purely Object-oriented ("Java's style"), we will iterate on it in the following exercise.

If you have difficulties with this exercice, you can jump to the next one: one solution is provided.

## Instructions

### 1) Create a class

Declare one class name `Car` in package `com.td.scala.classes`

The class _Car_ must have 3 attributes:

- nbDoor: private Int
- color: mutable String
- nbPlaces: immutable Int
- speed: mutable Int with default value 0

### 2) Create methods

Create the methods:

- speedUp:
    - takes one parameter to indicate the speed increae
        - if the parameter is negative then throw an `IllegalArgumentException`.
    - returns `Unit` type

- brake:
    - takes one parameter to indicate the speed decrease
        - if the parameter is negative then throw an `IllegalArgumentException`.
    - returns `Unit` type

**The speed must be an public mutable variable**

### 3) Run your code

Create one runnable class.
Instantiate one car, with primary constructor and after one with secondary constructor

In the `Main.scala`, create and drive your cars, accelerate, brake, check speed... test error cases also.

## Summary

Here we saw how create one class in Scala language and how declare some methods. In this implementation,
we used the object oriented paradigm by used the exception and used the mutable internal state.
The [week_1/02_Functional_Type/README.md](next exercise) will show you how we can change our approach and be more functional.
