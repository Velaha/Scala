package com.td.scala.type_class.banque

import com.td.scala.type_class.banque.converter.Converter

trait Bank[B] {
  def exchange[A](m: A)(implicit conv: ???): B
}

//Create a new bank which able to exchange EURO from
