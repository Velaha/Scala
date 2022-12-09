package com.td.scala.functions

object CarUtilities {

  /** Price mustn't appear, only color, nbDoor, nbPlaces* */
  val technicalFormat: Car => String = car => s"Color : ${car.color}, nbDoor : ${car.nbDoor}, nbPlaces : ${car.nbPlaces}"

  /** All caracteristics must me displayed* */
  val showRoomFormat: Car => String = car => s"Color : ${car.color}, nbDoor : ${car.nbDoor}, nbPlaces : ${car.nbPlaces}, speed : ${car.speed}, price : ${car.price}"

  /** Multiply parameter by 10* */
  val maxiTurbo: Int => Int = elem => elem * 10

  /** Multiply parameter by 2* */
  val softTurbo: Int => Int = elem => elem * 2

}
