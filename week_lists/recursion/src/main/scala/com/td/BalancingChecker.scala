package com.td.scala.recursion

object BalancingChecker {

  /** This methdod checks that the parenthesis in the input are balanced */
  def isBalanced(code: String): Boolean = {
    @annotation.tailrec
    def helper(code: List[Char], acc: Int): Int =
      code match {
        case _ if acc < 0 => acc
        case '(' :: tail => helper(tail, acc + 1)
        case ')' :: tail => helper(tail, acc - 1)
        case _ :: tail => helper(tail, acc)
        case Nil => acc
      }

    helper(code.toList, 0) == 0
  }
}
