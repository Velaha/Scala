package com.td.scala.implicits

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

class Test extends AnyFlatSpec with should.Matchers {

  // Pay attention to this import
  // it imports everything inside OptionHelpers, including implicits
  import OptionHelpers._

  "Adding two Some" should "be possible" in {
    Some(1) + Some(2) should be(Some(3))
    Some(1) + None should be(Some(1))
    None + Some(2) should be(Some(2))
    None + None should be(None)
  }

}
