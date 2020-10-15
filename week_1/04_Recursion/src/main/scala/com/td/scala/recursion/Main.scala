package com.td.scala.recursion

object Main extends App {

  val code: String = "Code To Analyse"
  val nb: Int      = 0

  /** This methdod checks that the parenthesis in the input are balanced */
  def balance(code: String): Either[String, Int] =
    ??? // TODO Implement this method with a tail-recursion approach

  val result = balance(code).fold(
    msg => "Parenthesis are not balanced",
    nb => "Congratulation!"
  )

}
