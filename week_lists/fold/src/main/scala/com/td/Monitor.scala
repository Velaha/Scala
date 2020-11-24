package com.td.fold

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

object Monitor {

  // TODO: deserialize the dates from Data.trips to LocalDateTime
  // DO NOT WRITE a helper function like:
  // def parse(list: List[List[(String, String)]]): List[List[(LocalDateTime, LocalDateTime)]] =
  // but
  // TODO: implement a function parse: ((String, String)) => (LocalDateTime, LocalDateTime)
<<<<<<< ac412fe445ad3d9ce2c9066967e5b8eaea23be5a
  val parse: ((String, String)) => (LocalDateTime, LocalDateTime) = ???

  // TODO: implement a function parse: ((String, String)) => (LocalDateTime, LocalDateTime)
  val duration: ((LocalDateTime, LocalDateTime)) => Long = ???
=======
  val parse: ((String, String)) => (LocalDateTime, LocalDateTime) = { case (start, end) =>
    (LocalDateTime.parse(start), LocalDateTime.parse(end))
  }

  // TODO: implement a function parse: ((String, String)) => (LocalDateTime, LocalDateTime)
  val duration: ((LocalDateTime, LocalDateTime)) => Long = { case (start, end) =>
    ChronoUnit.SECONDS.between(start, end)
  }
>>>>>>> Add exercices with map, fold, ...

}
