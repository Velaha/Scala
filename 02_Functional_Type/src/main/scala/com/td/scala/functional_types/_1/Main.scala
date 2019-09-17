package com.td.scala.functional_types._1

object Main extends App {


  val car1 = new Car(3, "white", 4)

  println(car1.color)

  car1.speedUp(10)

  println(car1.speed)

  car1.brake(-8)

  println(car1.speed)



}
