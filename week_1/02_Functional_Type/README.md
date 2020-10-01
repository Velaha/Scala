# Being Functional

## Purpose

This exercise aims to move from object-oriented to functional.
We will refactor the class _Car_ from the previous with a functional approach.

Go to package [week_1/02_Functional_Type/src/main/scala/com/td/scala/functional_types/_1/README.md](`com.td.scala.functional_types._1`)

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
