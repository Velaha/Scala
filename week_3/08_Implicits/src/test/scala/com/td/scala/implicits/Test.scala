package com.td.scala.implicits

import org.scalatest._
import flatspec._
import matchers._

class Test extends AnyFlatSpec with should.Matchers {

  "Naive add" should "add Some + Some" in {
    OptionHelpers.naiveAdd(Some(1), Some(2)) should be(Some(3))
  }

  it should "add Some + None" in {
    OptionHelpers.naiveAdd(Some(1), None) should be(Some(1))
  }

  it should "add None + Some" in {
    OptionHelpers.naiveAdd(None, Some(2)) should be(None)
  }

  it should "add None + None" in {
    OptionHelpers.naiveAdd(None, None) should be(None)
  }

  "Extension method: add options" should "Some + Some" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    Some(1).plus(Some(2)) should be(Some(3))
  }

  it should "add Some + None" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    Some(1).plus(None) should be(Some(1))
  }

  it should "add None + Some" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    None.plus(Some(2)) should be(None)
  }

  it should "add None + None" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    None.plus(None) should be(None)
  }

  "Extension method: option and int" should "add Some" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    Some(1) + 2 should be(Some(3))

  }

  it should "add None" in {
    // Pay attention to this import
    // it imports everything inside OptionHelpers, including implicits
    import OptionHelpers._

    None + 2 should be(None)
  }

}
