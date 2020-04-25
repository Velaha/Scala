package com.td.scala.recursion

object Main extends App {

  val code: String = "Code To Analyse"
  val nb: Int      = 0

  /** implement the method below in recursion fashion. This function must determin if all parenthesis are balanced **/
  def balance(code: String): Either[String, Int] = ???

  val result = balance(code).fold(
    msg => "Parenthesis are not balanced",
    nb => "Congratulation!"
  )

}
