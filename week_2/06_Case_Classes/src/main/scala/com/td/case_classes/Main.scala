package com.td.case_classes

object Main extends App {

  val firefox = Browser(1.0, "Firefox", Seq("Windows", "MacOs", "Linux"))
  val opera1   = Browser(0.4, "Opera", Seq("MacOs"))
  val chrome1  = Browser(2.4, "Chrome", Seq("Windows", "Linux"))
  val chrome2  = Browser(2.4, "Chrome", Seq("Windows", "Linux"))

  println("Firefox equals Chrome :" + firefox.equals(chrome1))
  println("Firefox == Chrome :" + (firefox == chrome1))
  println("Chrome1 equals Chrome2 : " + chrome1.equals(chrome2))
  println("Chrome1 == Chrome2 : " + (chrome1 == chrome2))

  //new version of chrome
  val chrome3 = chrome1.copy(version = 2.5)
  println(chrome3.version)
}
