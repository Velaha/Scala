# Recursion

## Purpose

This exercise aims to implement our data type `List` called "MyList"

## Instructions

### 1) Create `MyList`

`MyList[A]` is an abstract class with a **recursive** structure based on the two children:
- `End` with no value
- `Element` with a value and a pointer to the next element

### 2) Implement the methods

- `def isEmpty(): Boolean`
- `def length: Int`
- `def firstElement: Option[A]`, note that `List.head` throws an exception !
- `def remainingElements: MyList[A]`
- `def toPrint: String`, the values are simply separated by `, `
- `def map[B](f: A => B): MyList[B]`, you may want to re-read the lecture on the variance
- `def addElement[B >: A](a: B): MyList[A]`, you may not succeed

> Implement the signature in `com.td.mylist.MyList`
> Use the Main class to test it
> Run the tests
