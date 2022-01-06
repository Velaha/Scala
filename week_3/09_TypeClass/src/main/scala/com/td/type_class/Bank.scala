package com.td.type_class

import com.td.type_class.converter.Converter
import com.td.type_class.converter.Currency._

trait Bank[B] {
  def exchange[A](m: A)(implicit conv: Converter[A, B]): B
}

// Your bank : LaNef
