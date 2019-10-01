package com.td.scala.type_class.banque

import com.td.scala.type_class.banque.converter.{ Converter, EUR }

trait Bank[A] {


  def exchange[B](m: B)(implicit conv: Converter[A, B]): A
}

case class BNP() extends Bank[EUR] {
  override def exchange[B](m: B)(implicit conv: Converter[EUR, B]): EUR = conv.change(m)
}
