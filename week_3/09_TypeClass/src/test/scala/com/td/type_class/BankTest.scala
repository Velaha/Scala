package com.td.type_class

import org.scalatest._
import flatspec._
import matchers._

class BankTest extends AnyFlatSpec with should.Matchers {

  import com.td.type_class.LaNef
  import com.td.type_class.converter.Currency.{ EUR, JPN, USD }
  import com.td.type_class.converter.converters._

  "Currency exchange" should "convert correctly" in {
    LaNef().exchange(USD(12.0)) should be(EUR(18.0))
  }

}
