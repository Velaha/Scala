package com.td.scala.functional_types._1

object Main extends App {

  println("Improve the code of the class Car in a functional way")

  val car1 = new Car(3, "white", 4)

  println(car1.color)

  var result = car1.speedUp(10)
  result match {
    case Right(car) => println(car.speed)
    case Left(str) => println(str)
  }

  result = car1.brake(-8)
  result match {
    case Right(car) => println(car.speed)
    case Left(str) => println(str)
  }
  println(car1.speed)
}
