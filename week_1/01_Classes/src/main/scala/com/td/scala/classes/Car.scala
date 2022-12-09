package com.td.scala.classes

class Car (private val nbDoors: Int, var color: String, val nbPlaces: Int, var speed: Int = 0){
    def this(nbDoors: Int, nbPlaces: Int) = this(nbDoors, "blue", nbPlaces)


    def speedUp(increase: Int): Unit = {
        if (increase <= 0) {
            throw new IllegalArgumentException("Increase must be positive")
        }
        speed += increase
    }

    def break(decrease: Int): Unit = {
        if (decrease >= 0) {
            throw new IllegalArgumentException("Decrease must be negative")
        }
        speed += decrease
    }
}
