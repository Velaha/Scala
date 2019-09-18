package com.td.scala.functional_types._2

import com.td.scala.functional_types._2.constructor.CarConstructor.Color

class Car(nbDoor: Int, val color: Color, val nbPlaces: Int, val speed: Int = 0) {

  def speedUp(s: Int): Either[String, Car] =
    if (s <= 0) {
      Left("Speed must be greater than 0")
    } else {
      Right(new Car(this.nbDoor, this.color, this.nbPlaces, s + speed))
    }

  def brake(s: Int): Either[String, Car] =
    if (s >= 0) {
      Left("Speed must be lower than 0")
    } else {
      Right(new Car(this.nbDoor, this.color, this.nbPlaces, speed + s))
    }

}
