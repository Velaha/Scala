package com.td.recursion

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers.should.Matchers

class SumTest extends AnyFlatSpec with Matchers {

  "Non tail-recursive should" should "be correct for n=1" in {
    val n = 1
    Sum.recursive(n) should be(Sum.closedForm(n))
  }

  it should "be correct for n=10" in {
    val n = 10
    Sum.recursive(n) should be(Sum.closedForm(n))
  }

  "Tail-recursive should" should "be correct for n=1" in {
    val n = 1
    Sum.tailrecursive(n) should be(Sum.closedForm(n))
  }

  it should "be correct for n=10" in {
    val n = 10
    Sum.tailrecursive(n) should be(Sum.closedForm(n))
  }

}
