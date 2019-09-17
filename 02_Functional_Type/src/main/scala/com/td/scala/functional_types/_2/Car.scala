package com.td.scala.functional_types._2

class Car(nbDoor: Int, val color: String, val nbPlaces: Int, val speed: Int = 0) {


  def this(color: String) {
    this(2, color, 2)
  }


  def speedUp(s: Int): Either[String, Car] = if (s <= 0) {
    Left("Speed must be greater than 0")
  } else {
    Right(new Car(this.nbDoor, this.color, this.nbPlaces, s + speed))
  }

  def brake(s: Int): Either[String, Car] = if (s >= 0) {
    Left("Speed must be lower than 0")
  } else {
    Right(new Car(this.nbDoor, this.color, this.nbPlaces, speed + s))
  }

}




