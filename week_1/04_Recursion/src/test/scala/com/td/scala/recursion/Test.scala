package com.td.scala.recursion

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

import Assertions._

class Test extends AnyFlatSpec with should.Matchers {

  "An empty String" should "pass" in {
    Main.balance("") should be(true)
  }

  "()" should "pass" in {
    Main.balance("()") should be(true)
  }

  "(())" should "pass" in {
    Main.balance("(())") should be(true)
  }

  "(" should "fail" in {
    Main.balance("(") should not be (true) // should not be false == should be true :)
  }

  ")" should "fail" in {
    Main.balance(")") should be (false)
  }

  "()(" should "fail" in {
    Main.balance("()(") should be (false)
  }

  "(()" should "fail" in {
    Main.balance("(()") should be (false)
  }

  ")(" should "fail" in {
    Main.balance(")(") should be (false)
  }
}
