package com.td.scala.type_class

import com.td.scala.type_class.banque.BNP
import com.td.scala.type_class.banque.converter.{ DOL, YEN }
import com.td.scala.type_class.banque.converter.converters._

object Main extends App {

  println(BNP().exchange(DOL(12.0)).display)
  println(BNP().exchange(YEN(12.0)).display)

}
