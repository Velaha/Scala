package com.td.scala.classes

object Main extends App {
    val blackCar = new Car(2, "black", 4)
    val blueCar = new Car(4, 5)

    blueCar.speedUp(15)
    blueCar.break(-10)
    println(blueCar.speed)
    println(blackCar.color)
    println(blackCar.nbPlaces)

    //blackCar.break(-1)
    //blackCar.speedUp(-10)
}
