package com.td.scala.intro

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class IntroTest extends AnyFlatSpec with should.Matchers {

  // Test adapted from https://www.scalatest.org/ example
  "A test" should "always pass" in {
    val stack = new Stack[Int]
    stack.push(1)
    stack.push(2)
    stack.pop() should be (2)
    stack.pop() should be (1)
  }
}
