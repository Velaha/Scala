# ADT - Algebraic Data Type

## Purpose

Discover Algebraic Data Type (ADT).

ADT is a mecanism that allows to extend the type system in a structured manner.
It helps to make our code base more robust

## Instructions

### 1) Make thing more formal

In package `com.td.scala.adt._1`, go to the case class `Browser` 

The attributes `Kind` and `Platform` have limited number a possible values.

Let's define better types for them!

`Kind` has the following values:
- Firefox
- Chrome
- IE
- Opera
- Safari

`Platform` has the following values:
- Windows
- Linux
- MacOs

> Create the possible values for the two attributes

Additionnally,
- the types should be _closed_ (cannot be extended outside of their context).
- the types should be placed respectively in `types.kind` and `types.platform` modules

*Tip: module == object nested*


### 2) Release new version

In package `com.td.scala.adt._2`, go to the case class `Browser`

The type system enhanced by Kind and Platform as expected from previous task.

> Implement `releaseVersion` method holded by the `utils.ReleaseManager`

*Tip: This implementation must based on the _case class_ characteristics*

Check that the new release of the browser is not equals to old one

### 3) Destructure your case class

In the package `com.td.scala.adt._3`, there is an object `utils.DB`.

DB provides one method that requires a predicate as parameter.

Your job here is to implement several predicates according the following specifications:
 - select all Firefox browsers
 - select all Chrome browsers compliant with Windows platform
 - select all browser with version equals to 1.0
 - select all Opera and IE browsers
 - select Chrome browser with version 3.4 and compliant with Linux Platform

*Tip: review Higher-order functions*

## Summary

In this exercise, we saw that the type system (throught ADT) helps us to produce safer code.

# End of week 2
