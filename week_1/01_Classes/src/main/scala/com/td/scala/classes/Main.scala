package com.td.scala.classes

object Main extends App {

  println("Drive your car here")

  val car1 = new Car(3, "white", 4)

  println(car1.color)

  car1.speedUp(10)

  println(car1.speed)

  car1.brake(-8)

  println(car1.speed)
}
