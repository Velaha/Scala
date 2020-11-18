package com.td.recursion

import scala.util.{ Failure, Success, Try }

object Main extends App {

  private def computeSum(n: Long, f: Long => Long) =
    try println(s"n=$n -> ${f(n)}")
    catch {
      case error: Throwable => println(s"n=$n -> error")
    }

  println("Enter an integer:")

  Try(scala.io.StdIn.readLong()) match {
    case Failure(exception) =>
      println("Try another time")
    case Success(n) =>
      computeSum(n, Sum.closedForm)
      computeSum(n, Sum.recursive)
      computeSum(n, Sum.tailrecursive)
  }

}
