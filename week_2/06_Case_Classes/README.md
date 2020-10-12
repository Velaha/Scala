# Case classes

## Purpose

Use _cases classes_ to represent models.

Question: when do we use _classes_ in Scala?

Case class will ease your life developer

## Instructions

We will replace the usages of _classes_ by _cases classes_

### 1) Same but with case class

> Declare one case class name `Browser` in package `com.td.scala.case_classes`

The class `Browser` has 3 attributes:

- `version`: Double : public immutable
- `kind`: String : public immutable
- `platform`: String : public immutable

and create the follwing instances in `Main.scala`
- `firefox1`: Firefox version 1.0, on Platform : Windows, MacOs Linux
- `opera1`: Opera version 0.4, on Platform MacOs
- `chrome1`: Chrome version 2.4, on Platform : Windows, Linux
- `chrome2`: Chrome version 2.4, on Platform : Windows, Linux   // identical to chrome1 but different reference

*Tip: for a case class, all fields are public and immutable by default*

### 2) Comparison : Semantic vs Reference

Our program requires to compare different instances of browsers

> Make a comparison between `firefox1` and `chrome1` by `equals`' method and with `==` operator

The instances are different

> Make a comparison between chrome1 and chrome2

What do you notice?

We will see here that the behavior of _case classes_ is different than _classes_. If you need the same semantic than _classes_, you can use the `eq` and `ne` methods. Both methods are based on reference comparison


### 3) New version

Functional Programming values immutability. Hence, each time the internal state of an object has to be modified, a new one is created with some updated values.

The Chrome's `2.5` version has been released!

> Create the instance corresponding to the new version with the `copy` method

> Display the version


### 4) One companion for life

_Case classes_ can be instantiated without the operator `new`. Notice that we did not have to implement the companion object to have this behavior like we had to with normal _classes_.

## Summary

Here, we discovered _case classes_. It is a central feature in Scala. _Case classes_ provide plenty of methods which ease and clarify our code base!

[Next exercice](/week_2/07_ADT/README.md)
