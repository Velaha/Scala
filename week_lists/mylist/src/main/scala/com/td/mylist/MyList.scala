package com.td.mylist

sealed abstract class MyList[+A] {
  def isEmpty(): Boolean = this == End

  // example of using inheritance style
  def length: Int

  // Tyepsafe
  def firstElement: Option[A] = this match {
    case End => None
    case Element(value, next) => Some(value)
  }

  def remainingElements: MyList[A] = this match {
    case End => End
    case Element(value, next) => next
  }

  // example of abstract implementation
  def toPrint: String = this match {
    case End => ""
    case Element(value, End) => s"$value"
    case Element(value, next) => s"$value, ${next.toPrint}"
  }

  def map[B](f: A => B): MyList[B]

  def addElement[B >: A](a: B): MyList[A] = this match {
    case End => Element(a, End).asInstanceOf[MyList[A]]
    case xs @ Element(value, next) => Element(a, xs).asInstanceOf[MyList[A]]
  }
}

case object End extends MyList[Nothing] {
  def length: Int = 0

  // Nothing makes very clear that there is nothing to map
  def map[B](f: Nothing => B): MyList[B] = End
}

case class Element[T](value: T, next: MyList[T]) extends MyList[T] {
  def length: Int                  = 1 + next.length
  def map[B](f: T => B): MyList[B] = Element(f(value), next.map(f))
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
