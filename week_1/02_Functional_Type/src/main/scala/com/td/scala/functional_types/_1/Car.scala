package com.td.scala.functional_types._1

class Car(nbDoor: Int, var color: String, val nbPlaces: Int, var speed: Int = 0) {

  def speedUp(s: Int): Unit =
    if (s <= 0) {
      throw new IllegalArgumentException("Speed must be greater than 0")
    } else {
      speed = s + speed
    }

  def brake(s: Int): Unit =
    if (s >= 0) {
      throw new IllegalArgumentException("Speed must be lower than 0")
    } else {
      speed = speed + s
    }

}
