package com.td.implicits

object OptionHelpers {

  // 1: Implement this function
  def naiveAdd(option1: Option[Int], option2: Option[Int]): Option[Int] = option1 match {
    case Some(value) => Some(option2.map(_ + value).getOrElse(value))
    case None => None
  }

  implicit class RichOption(option: Option[Int]) {
    // 2: Implement an extension method that adds two Option[Int]
    def plus(that: Option[Int]) = naiveAdd(option, that)

    // 3: Implement a solution to add option and int
    def +(that: Int) = naiveAdd(option, Some(that))
  }
}
