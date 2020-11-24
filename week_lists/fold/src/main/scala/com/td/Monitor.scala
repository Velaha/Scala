package com.td.fold

import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

object Monitor {

  // TODO: deserialize the dates from Data.trips to LocalDateTime
  // DO NOT WRITE a helper function like:
  // def parse(list: List[List[(String, String)]]): List[List[(LocalDateTime, LocalDateTime)]] =
  // but
  // TODO: implement a function parse: ((String, String)) => (LocalDateTime, LocalDateTime)
  val parse: ((String, String)) => (LocalDateTime, LocalDateTime) = ???

  // TODO: implement a function parse: ((String, String)) => (LocalDateTime, LocalDateTime)
  val duration: ((LocalDateTime, LocalDateTime)) => Long = ???

}
