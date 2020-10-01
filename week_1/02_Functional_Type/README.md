# Being Functional

## Purpose

This exercise aims to move from object-oriented to functional.
We will refactor the class _Car_ from the previous with a functional approach.


## Instructions

**An implementation of the class `Car` is provided**

### 1) Immutability is my friend

Go to package `com.td.scala.functional_types._1`

The first step is to enforce immutability.
_Immutability is a central aspect of functional programing_

Replace attributes `private`/ `var` by `val` declarations.
Now, we are allowed to read all attribute from outside of the instance.


### 2) Master word: Pure

Still in `com.td.scala.functional_types._1`

The two methods break the concept of functional paradigm:

- modifies internal state of the instance
- has no return value
- throws an exception

We are going to walk through out some steps to make this code more functional.
Let's use the functional types that we have seen during the lecture. They will help us in our quest!

**First step**, we are going to stop to modify the internal state (speed) of our Car. To achieve that,
we now return a new Car with new computed speed.

This is the signature of Car's methods:

```scala
def speedUp(s: Int): Car

def brake(s: Int): Car
```

Each time the speed is changed, a new reference of a new Car is created.

    > Implement and try these new signatures

**Second step**, next problem of the initial implementation is the exception thrown in case of wrong parameter.
This kind of behavior break the execution flow and make things no determinist. `Either` functional type will be really useful

This type contains two subType _A_ and _B_: `Either[A, B]` to describe a failure or a success.
It is perfect for our needs. Then here we will introduce this type in methods' signature of the class `Car`.

```scala
def speedUp(s: Int): Either[String,Car]

def brake(s: Int): Either[String,Car]
```

    > Change your code accordingly.
    Integrate the pattern matching to handle the result (Left or Right)


### 3) Car constructor

Go to package `com.td.scala.functional_types._2`

In this section, we will use others functional type: `Option`, `List`

Info: We have modified the Car's signature. The field `color: String` has been replaced by a type `Color` (we will ignore the details of its implementation for the moment).

Utility class `CarConstructor` is available in package `constructor`.

Do following points:

 - Search a car by its id (from 1 to 7), and
 - Display its color
 - Avoid any crash when Car isn't found (pattern matching, fold, etc..)

 - Now we looking for some Cars with the same color
 - Once you found some Car (or not), compute the whole number of places available
 - Avoid any crash when Car isn't found (pattern matching, fold, etc..)


## Summary

In this section, you learned how to make your code more functional (immutable, without raising exceptions).
Also, you worked with some functional types that allows you to describe what you want to do instead of write it (execution flow).
