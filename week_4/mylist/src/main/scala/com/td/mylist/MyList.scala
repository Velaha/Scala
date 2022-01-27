package com.td.mylist

sealed abstract class MyList[+A] {
  def isEmpty(): Boolean = ???

  // example of using inheritance style
  def length: Int

  // Tyepsafe
  def firstElement: Option[A] = ???

  def remainingElements: MyList[A] = ???

  // example of abstract implementation
  def toPrint: String = ???

  def map[B](f: A => B): MyList[B]

  def addElement[B >: A](a: B): MyList[A] = ???
}

case object End extends MyList[Nothing] {
  def length: Int = ???

  // Nothing makes very clear that there is nothing to map
  def map[B](f: Nothing => B): MyList[B] = ???
}

case class Element[T](value: T, next: MyList[T]) extends MyList[T] {
  def length: Int                  = ???
  def map[B](f: T => B): MyList[B] = ???
}

// Companion object
object MyList {
  def initEmpty(): MyList[Nothing] = End

  def init[T](values: T*): MyList[T] = {
    def helper(accumulator: MyList[T], index: Int, array: Seq[T]): MyList[T] =
      if (index == 0) {
        Element(array.apply(index), accumulator)
      } else {
        helper(
          Element(array.apply(index), accumulator),
          index - 1,
          array
        )
      }

    if (values.length > 0) helper(End, values.length - 1, values)
    else End
  }

  def apply[T](values: T*): MyList[T] = init(values: _*)
}
