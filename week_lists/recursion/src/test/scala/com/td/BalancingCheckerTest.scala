package com.td.scala.recursion

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

import Assertions._

class BalancingCheckerTest extends AnyFlatSpec with should.Matchers {

  "An empty String" should "pass" in {
    BalancingChecker.isBalanced("") should be(true)
  }

  "()" should "pass" in {
    BalancingChecker.isBalanced("()") should be(true)
  }

  "(())" should "pass" in {
    BalancingChecker.isBalanced("(())") should be(true)
  }

  "(" should "fail" in {
    BalancingChecker.isBalanced("(") should not be true // should not be false == should be true :)
  }

  ")" should "fail" in {
    BalancingChecker.isBalanced(")") should be(false)
  }

  "()(" should "fail" in {
    BalancingChecker.isBalanced("()(") should be(false)
  }

  "(()" should "fail" in {
    BalancingChecker.isBalanced("(()") should be(false)
  }

  ")(" should "fail" in {
    BalancingChecker.isBalanced(")(") should be(false)
  }
}
