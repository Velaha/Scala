package com.td.scala.implicits

import org.scalatest._
import flatspec._
import matchers._

class Test extends AnyFlatSpec with should.Matchers {

  "Naive add" should "return" in {
    OptionHelpers.naiveAdd(Some(1), Some(2)) should be(Some(3))
    OptionHelpers.naiveAdd(Some(1), None) should be(Some(1))
    OptionHelpers.naiveAdd(None, Some(2)) should be(Some(2))
    OptionHelpers.naiveAdd(None, None) should be(None)
  }

  "Extension method: add options" should "return" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    Some(1).plus(Some(2)) should be(Some(3))
    Some(1).plus(None) should be(Some(1))
    None.plus(Some(2)) should be(Some(2))
    None.plus(None) should be(None)
  }

  "Extension method: add option and int" should "return" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    Some(1) + 2 should be(Some(3))
    None + 2 should be(None)
  }

}
