package com.td.scala.classes

object Main extends App {
    val blueCar = new Car(2, "blue", 4)
    val blackCar = new Car(4, 5)

    blueCar.speedUp(15)
    blueCar.break(10)
    println(blueCar.speed)

    //blackCar.break(-1)
    //blackCar.speedUp(-10)


}
