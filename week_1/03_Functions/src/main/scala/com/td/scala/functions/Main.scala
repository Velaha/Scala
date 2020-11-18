package com.td.scala.functions

import com.td.scala.functions.constructor.CarConstructor
import com.td.scala.functions.constructor.CarConstructor.Green

object Main extends App {

  import CarUtilities._

  println("Prepare characteristic sheets (technical) for all green car")
  println(CarConstructor.searchCarsByColor(CarConstructor.Green).map(technicalFormat))

  println("Prepare characteristic sheets (showroom) for all pink car")
  println(CarConstructor.searchCarsByColor(CarConstructor.Pink).map(showRoomFormat))

  println("""Build a concept car that embeded a turbo that make it the faster car in the world
      |when the pilot speed up, its speed rise up by 10 times than standard car
      |""".stripMargin)
  val c = new Car(4, Green, 4, 100.0)
  c.speedUp(3, maxiTurbo)

  println("""Build a standard car that embeded a turbo that make it the luxurious car in the world
      |when the driver speed up, its speed rise up by 2 times
      |""".stripMargin)

  val c1 = new Car(4, Green, 4, 100.0)
  c1.speedUp(3, softTurbo)

}
