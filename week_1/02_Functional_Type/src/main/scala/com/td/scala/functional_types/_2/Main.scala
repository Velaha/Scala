package com.td.scala.functional_types._2

import com.td.scala.functional_types._2.constructor.CarConstructor

object Main extends App {

    println("Implement here several kind of searchs")


    // question 1
    for (i <- 13 to 15) {
        val car = CarConstructor.searchCarById(i)
        car.fold(println("No car at id " + i))(c => println(c.color))
    }

    //question 2
    println("-------------")
    var result = CarConstructor.searchCarsByColor(CarConstructor.Red)
    println("Number of places available : " + result.map(c => c.nbPlaces).sum)

    var result2 = CarConstructor.searchCarsByColor(CarConstructor.Rede)
    println("Number of places available : " + result2.map(c => c.nbPlaces).sum)

}
