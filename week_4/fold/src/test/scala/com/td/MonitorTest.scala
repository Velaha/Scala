package com.td.fold

import collection.mutable.Stack
import org.scalatest._
import flatspec._
import matchers._

import java.time.LocalDateTime

import Assertions._

class MonitorTest extends AnyFlatSpec with should.Matchers {

  "Parse" should "be correct" in {
    val date = "2021-01-03T21:46:39.602843"
    Monitor.parse((date, date)) == (LocalDateTime.parse("2021-01-03T21:46:39.602843"), LocalDateTime.parse(date))
  }

  "Duration" should "be correct" in {
    val date = LocalDateTime.parse("2021-01-03T21:46:39.602843")
    Monitor.duration((date, date.plusMinutes(10L))) == 10L
  }

}
