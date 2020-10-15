package com.td.scala.recursion

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

import Assertions._

class Test extends AnyFlatSpec with should.Matchers {

  "An empty String" should "pass" in {
    Main.balance("") should be(Right(0))
  }

  "()" should "pass" in {
    Main.balance("()") should be(Right(0))
  }

  "(())" should "pass" in {
    Main.balance("(())") should be(Right(0))
  }

  "(" should "fail" in {
    Main.balance("(") should not be (Right(0))
  }

  ")" should "fail" in {
    Main.balance(")") should not be (Right(0))
  }

  "()(" should "fail" in {
    Main.balance("()(") should not be (Right(0))
  }

  "(()" should "fail" in {
    Main.balance("(()") should not be (Right(0))
  }

}
