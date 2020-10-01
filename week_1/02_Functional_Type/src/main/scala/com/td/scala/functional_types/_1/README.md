# Instructions

**An implementation of the class `Car` is provided**

## Part 1) Immutability is my friend

The first step is to enforce immutability.
_Immutability is a central aspect of functional programing_

Replace attributes `private`/ `var` by `val` declarations.
Now, we are allowed to read all attribute from outside of the instance.


## Part 2) Master word: Pure

The two methods break the concept of functional paradigm:

- modifies internal state of the instance
- has no return value
- throws an exception

We are going to walk through out some steps to make this code more functional.
Let's use the functional types that we have seen during the lecture. They will help us in our quest!

### First step
We are going to stop to modify the internal state (speed) of our Car.
To achieve that, we now return a new Car with new computed speed.

This is the signature of Car's methods:

```scala
def speedUp(s: Int): Car

def brake(s: Int): Car
```

Each time the speed is changed, a new reference of a new Car is created.

> Implement and try these new signatures

### Second step
Next problem is to handle the exception thrown in case of wrong parameter.
This kind of behavior break the execution flow and make things no determinist.
`Either` functional type will be really useful.

This type contains two subType _A_ and _B_: `Either[A, B]` to describe a failure or a success.
It is perfect for our needs. Then here we will introduce this type in methods' signature of the class `Car`.

```scala
def speedUp(s: Int): Either[String,Car]

def brake(s: Int): Either[String,Car]
```

> Change your code accordingly.
Integrate the pattern matching to handle the result (Left or Right)

[Third part](../_2/README.md)
