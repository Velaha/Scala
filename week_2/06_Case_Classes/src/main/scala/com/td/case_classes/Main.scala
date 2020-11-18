package com.td.case_classes

object Main {

  val firefox = Browser(1.0, "Firefox", Seq("Windows", "MacOs", "Linux"))
  val chrome  = Browser(2.4, "Chrome", Seq("Windows", "Linux"))
  val opera   = Browser(0.4, "Opera", Seq("MacOs"))

  println((firefox.equals(chrome)))
  println((chrome.equals(chrome)))

  //new version of chrome
  val chrome2_5 = chrome.copy(version = 2.5)

  println(chrome2_5.version)

  val chrome2_6 = Browser(2.6, chrome.kind, chrome.platform)

}
