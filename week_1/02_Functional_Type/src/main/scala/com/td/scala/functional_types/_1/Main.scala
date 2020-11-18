package com.td.scala.functional_types._1

object Main extends App {

  println("Improve the code of the class Car in a functional way")
  val car1 = new Car(3, "white", 4, speed = 20)

  println(car1.color)

  val car2: Either[String, Car] = car1.speedUp(10)

  // solution 1
  println("sol1")
  car2 match {
    case Left(er) => println(s"une erreur est survenue ${er}")
    case Right(c) => println(s"La vitesse de la voiture est ${c.speed}")
  }

  println("sol2")
  // solution 2
  car2.fold(
    err => println(s"une erreur est survenue ${err}"),
    c => println(s"La vitesse de la voiture est ${c.speed}")
  )

  val car3 = car1.brake(-8)

  car3 match {
    case Left(er) => println(s"une erreur est survenue ${er}")
    case Right(c) => println(s"La vitesse de la voiture est ${c.speed}")
  }
  println(car1.speed)

}
