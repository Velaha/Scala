package com.td.scala.classes

object Main extends App {

  val firefox = new Browser(1.0, "Firefox", Seq("Windows", "MacOs", "Linux"))
  val chrome  = new Browser(2.4, "Chrome", Seq("Windows", "Linux"))
  val opera   = new Browser(0.4, "Opera", Seq("MacOs"))

  println((firefox.equals(chrome)))
  println((chrome.equals(chrome)))

  //new version of chrome
  val chrome2_5 = new Browser(2.5, chrome.kind, chrome.platform)

  println(chrome2_5.version)

  val chrome2_6 = Browser(2.6, chrome.kind, chrome.platform)

}
