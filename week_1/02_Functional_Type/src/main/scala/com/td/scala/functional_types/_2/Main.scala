package com.td.scala.functional_types._2

import com.td.scala.functional_types._2.constructor.CarConstructor
import com.td.scala.functional_types._2.constructor.CarConstructor.{ Green, Rede }

object Main extends App {

  println("Implement here several kind of searchs")

  CarConstructor.searchCarById(2) match {
    case Some(c) => println(c.color)
    case None => println("no car found")
  }

  CarConstructor.searchCarsByColor(Rede).map(_.nbPlaces).sum

}
