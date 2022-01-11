package com.td.fold

object Main extends App {
  // See Data.trips and Data.names

  // Parse the String to LocalDateTime and then compute the duration of each trip
  val tripsDuration: List[List[Long]] = ???

  // Find the duration of the longest trip
  // result: 59280 minutes
  val longestTripOfAll: Long = ???

  // Zip trips and names
  val tripsAndName: List[(List[Long], String)] = ???

  // Find the name and the number of trip for the cyclist with the biggest number of trips
  // Hint: tripsAndName.foldLeft
  // result: (Kara, 6)
  val top1ByNumberOfTrips: (String, Int) = ???

}
