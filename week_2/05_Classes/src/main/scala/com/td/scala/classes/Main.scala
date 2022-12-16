package com.td.scala.classes

object Main extends App {
    val firefox1 = new Browser(1.0, "Firefox", Seq("Windows", "MacOs", "Linux"))
    val opera1 = new Browser(0.4, "Opera", Seq("MacOs"))
    val chrome1 = new Browser(2.4, "Chrome", Seq("Windows", "Linux"))
    val chrome2 = new Browser(2.4, "Chrome", Seq("Windows", "Linux"))

    println("firefox1 = chrome1 ? " + firefox1.equals(chrome1))
    println("chrome1 = chrome2 ? " + chrome1.equals(chrome2))

    val chrome3 = new Browser(2.5, "Chrome", Seq("Windows", "Linux"))
    println(chrome3.version)

    val test1 = Browser.apply(0.1, "test", Seq())
    val test2 = Browser(0.2, "test", Seq())
    println(test1.version)
    println(test2.version)
}
