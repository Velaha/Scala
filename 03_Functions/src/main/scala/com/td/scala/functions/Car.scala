package com.td.scala.functions

import com.td.scala.functions.constructor.CarConstructor.Color

class Car(val nbDoor: Int, val color: Color, val nbPlaces: Int, price: Double = 0.0, val speed: Int = 0) {

  def speedUp(s: Int, turbo: Int => Int = identity[Int]): Either[String, Car] =
    if (s <= 0) {
      Left("Speed must be greater than 0")
    } else {
      Right(
        new Car(
          this.nbDoor,
          this.color,
          this.nbPlaces,
          turbo(s + speed)
        )
      )
    }

  def brake(s: Int): Either[String, Car] =
    if (s >= 0) {
      Left("Speed must be lower than 0")
    } else {
      Right(new Car(this.nbDoor, this.color, this.nbPlaces, speed + s))
    }

}
