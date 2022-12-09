package com.td.scala.functional_types._1

class Car(val nbDoor: Int, val color: String, val nbPlaces: Int, val speed: Int = 0) {

    /*
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
      }*/

    /*
    def speedUp(s: Int): Car = {
        if (s <= 0) {
            throw new IllegalArgumentException("Speed must be greater than 0")
        } else {
            new Car(this.nbDoor, this.color, this.nbPlaces, this.speed + s)
        }
    }

    def brake(s: Int): Car = {
        if (s >= 0) {
            throw new IllegalArgumentException("Speed must be lower than 0")
        } else {
            new Car(this.nbDoor, this.color, this.nbPlaces, this.speed + s)
        }
    }*/

    def speedUp(s: Int): Either[String,Car] = {
        if (s <= 0) Left("Speed must be greater than 0")
        Right(new Car(this.nbDoor, this.color, this.nbPlaces, this.speed + s))
    }

    def brake(s: Int): Either[String,Car] = {
        if (s >= 0) Left("Speed must be lower than 0")
        Right(new Car(this.nbDoor, this.color, this.nbPlaces, this.speed + s))
    }

}
