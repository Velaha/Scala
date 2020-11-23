# Classes

## Purpose

This exercice revisits the notion of _classes_.

## Instructions

For this exercice, we want to represent Web browsers into our program

### 1) First attempt

> Declare one class name `Browser` in the package `com.td.scala.classes`

The class `Browser` has 3 attributes:

- `version`: Double : public immutable
- `kind`: String : public immutable
- `platform`: Seq[String] : public immutable

and create the follwing instances in `Main.scala`
- `firefox1`: Firefox version 1.0, on Platform : Windows, MacOs Linux
- `opera1`: Opera version 0.4, on Platform MacOs
- `chrome1`: Chrome version 2.4, on Platform : Windows, Linux
- `chrome2`: Chrome version 2.4, on Platform : Windows, Linux   // identical to chrome1 but different reference

### 2) Comparison : Semantic vs Reference

Our program requires to compare different instances of browsers

> Make a comparison between `firefox1` and `chrome1` by `equals`' method

The instances are different

> Make a comparison between chrome1 and chrome2

What do you notice? What can we do to improve this behavior ? (What would you do in Java?)


### 3) New version

Functional Programming values immutability. Hence, each time the internal state of an object has to be modified, a new one is created with some updated values.

The Chrome's `2.5` version has been released!

> Create the instance corresponding to the new version

> Display the version


### 4) One companion for life

To create a instance of a class, we need to use the `new` operator. Scala offers a mechanism to avoid this operator.

> Create the companion object of `Browser`

> Implement the right method to allow instantiation of `Browser` without using the new operator


## Summary

In this section, we briefly came back to the notion of classes and bumped into some recurrent complexity of coding (compare, update object, ...).

The [next exercice](/week_2/06_Case_Classes/README.md) overcomes that with _case classes_.
