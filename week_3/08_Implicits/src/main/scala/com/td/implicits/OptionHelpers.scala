package com.td.implicits

object OptionHelpers {

  // 1: Implement this function
  def naiveAdd(option1: Option[Int], option2: Option[Int]): Option[Int] = option1 match {
    case Some(value) => Some(value + option2.getOrElse(0))
    case None => None
  }

  /*
  def naiveAdd(option1: Option[Int], option2: Option[Int]): Option[Int] = {
    if (option1.isEmpty) None
    else Some(option1.get + option2.getOrElse(0))
  }
   */

  implicit class RichOptionInt(val option1: Option[Int]) {
    def plus(option2: Option[Int]): Option[Int] = naiveAdd(option1, option2)

    def +(integer: Int): Option[Int] = naiveAdd(option1, Some(integer))
  }
}
