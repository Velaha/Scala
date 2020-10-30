# Classes (recall)

## Purpose

The exercice aims to use implicits.

## Instructions

### 1) Addition of Option

We want to implement some function that allow us to addition two Option[A]

We mean that we want to addition the type contained into both options :

```scala
val a: A
val b: A

val option1: Option[A] = Some(a) + Some(b)
```

`option1` should be equal to `Some(a+b)`

For our implementation, we will use `Int` as a type.

### 2) Enhance Option type

In exercise above, we implemented functions. Those functions are not directly invoked on the option.

Now we want enhance the `Option` type by invoking our function directly on the `Option` type


### 3) Option[Int] + a:Int 

Now add a new function that allows to add one option[Int] and a simple value of type Int


### 4) Bonus (not mandatory)

Think how to make things more generic and provide an implementation (based on implicits) that allow to add every kind of types...


## Summary

Here, we see how, with implicit mechanism, we can help us to enhance a standard type. It could usefull in some case.
