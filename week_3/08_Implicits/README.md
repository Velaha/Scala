# Classes (recall)

## Purpose

The exercice aims to use implicits

## Instructions

### 1) Addition of Option

- Implement the function `naiveAdd` that adds two `Option[Int]`
- Run the unit tests to validate your work

### 2) Enhance Option type

The function `naiveAdd` is not a method of `Option[Int]`:

- Enhance `Option[Int]` type by invoking our function directly on the `Option` type

Example

```scala
val option: Option[Int] = ???
option.plus(None)
```

is valid

### 3) Option[Int] + a: Int

- Implement a new method that adds an `Option[Int]` and a value of type `Int`

```scala
val option: Option[Int] = ???
option plus 2
```

### 4) Bonus (not mandatory)

Think how to make things more generic and provide an implementation (based on implicits) that allow to add every kind of types...

## Summary

Note that,
- `Some(1) plus Some(2)`
  - is equivalent to `Some(1).plus(Some(2))`
  - is valid only if the _implicit class_ (extension method mecanism) is imported in the scope
- `Some(1) + 2` is valid for the same reason
- `2 + Some(1)` is not valid, why?

Here, we see how, with implicit mechanism, we can help us to enhance a standard type. It could usefull in some case.
