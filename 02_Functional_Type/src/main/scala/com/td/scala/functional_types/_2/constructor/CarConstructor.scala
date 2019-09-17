package com.td.scala.functional_types._2.constructor

import com.td.scala.functional_types._2.Car

object CarConstructor {


  private val garage: Map[Int, Car] = Map(
    1 -> new Car(5, "blue", 4)
    , 2 -> new Car(2, "Red", 4)
    , 3 -> new Car(2, "yellow", 4)
    , 4 -> new Car(3, "Gray", 4)
    , 5 -> new Car(2, "Black", 4)
    , 6 -> new Car(5, "Rose", 6)
    , 7 -> new Car(2, "Marine", 4)
  )


  def searchCar(code: Int): Option[Car] = {
    garage.get(code)
  }


}
