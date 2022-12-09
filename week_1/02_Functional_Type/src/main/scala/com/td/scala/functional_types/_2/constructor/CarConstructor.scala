package com.td.scala.functional_types._2.constructor

import com.td.scala.functional_types._2.Car

object CarConstructor {

  sealed trait Color {
    val color: String
  }

  case object Blue extends Color {
    override val color: String = "Blue"
  }

  case object Yellow extends Color {
    override val color: String = "Yellow"
  }

  case object Red extends Color {
    override val color: String = "Red"
  }

  case object Rede extends Color {
    override val color: String = "Red"
  }

  case object Gray extends Color {
    override val color: String = "Gray"
  }

  case object Black extends Color {
    override val color: String = "Black"
  }

  case object Pink extends Color {
    override val color: String = "Pink"
  }

  case object Green extends Color {
    override val color: String = "Green"
  }

  private val garage: Map[Int, Car] = Map[Int, Car](
    1 -> new Car(5, Blue, 4),
    2 -> new Car(2, Red, 3),
    3 -> new Car(2, Yellow, 5),
    4 -> new Car(3, Gray, 4),
    5 -> new Car(2, Black, 2),
    6 -> new Car(5, Pink, 6),
    7 -> new Car(2, Green, 4),
    8 -> new Car(2, Black, 4),
    9 -> new Car(2, Green, 10),
    10 -> new Car(2, Green, 4),
    11 -> new Car(2, Green, 1),
    12 -> new Car(5, Blue, 7),
    13 -> new Car(5, Pink, 7),
    14 -> new Car(5, Red, 2)
  )

  def searchCarById(code: Int): Option[Car] = garage.get(code)

  def searchCarsByColor(c: Color): List[Car] = garage.values.filter(car => car.color == c).toList

}
