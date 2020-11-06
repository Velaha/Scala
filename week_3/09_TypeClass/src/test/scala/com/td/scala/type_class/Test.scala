package com.td.scala.type_class

import org.scalatest._
import flatspec._
import matchers._

class Test extends AnyFlatSpec with should.Matchers {

  import com.td.scala.type_class.banque.LaNef
  import com.td.scala.type_class.banque.converter.Currency.{ DOL, EUR, YEN }
  import com.td.scala.type_class.banque.converter.converters._

  "Currency exchange" should "convert correctly" in {
    LaNef().exchange(DOL(12.0)) should be(EUR(18.0))
  }

}
