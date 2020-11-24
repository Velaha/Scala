package com.td.fold

object Main extends App {
<<<<<<< ac412fe445ad3d9ce2c9066967e5b8eaea23be5a
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
=======
  // Playground

   val tripsDuration: List[List[Long]] = Data.trips
    .map(
      _.map(Monitor.parse)
        .map(Monitor.duration)
    )

    // result: 59280 minutes
  val longestTripOfAll: Long = tripsDuration.flatten.max

  val tripsAndName: List[(List[Long], String)] = tripsDuration
    .zip(Data.names)

    // result: (Kara, 6)
  val top1ByNumberOfTrips: (String, Int) = tripsAndName.foldLeft(("", 0)) {
    case (acc, tripsAndName) if tripsAndName._1.length > acc._2 => (tripsAndName._2, tripsAndName._1.length)
    case (acc, tripsAndName) => acc
  }

  println(longestTripOfAll)
  println( top1ByNumberOfTrips )
>>>>>>> Add exercices with map, fold, ...

}
