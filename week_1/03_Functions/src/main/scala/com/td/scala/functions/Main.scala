package com.td.scala.functions

import com.td.scala.functions.constructor.CarConstructor

object Main extends App {

  println("Prepare characteristic sheets (technical) for all green car")
  CarConstructor.searchCarsByColor(CarConstructor.Green).foreach(car => println(CarUtilities.technicalFormat(car)))

  println("Prepare characteristic sheets (showroom) for all pink car")
  CarConstructor.searchCarsByColor(CarConstructor.Pink).foreach(car => println(CarUtilities.showRoomFormat(car)))

  println("""Build a concept car that embeded a turbo that make it the faster car in the world
      |when the pilot speed up, its speed rise up by 10 times than standard car
      |""".stripMargin)
  val car1 = new Car(3, CarConstructor.Red, 2, 1000)
  car1.speedUp(10, CarUtilities.maxiTurbo)


  println("""Build a standard car that embeded a turbo that make it the luxurious car in the world
      |when the driver speed up, its speed rise up by 2 times
      |""".stripMargin)
  val car2 = new Car(5, CarConstructor.Black, 5, 1000)
  car2.speedUp(10, CarUtilities.softTurbo)
}
