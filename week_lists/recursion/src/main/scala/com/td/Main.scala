package com.td.scala.recursion

object Main extends App {

  val booleanToString = (boolean: Boolean) =>
    if (boolean) "> Congratulation!"
    else "> Parenthesis are not balanced"

  List(
    "Code To Analyse",
    "()",
    "(",
    ")",
    "and RUN the tests!"
  )
    .map(BalancingChecker.isBalanced)
    .map(booleanToString)
    .foreach(println)

}
