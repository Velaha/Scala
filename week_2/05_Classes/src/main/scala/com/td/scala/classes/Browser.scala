package com.td.scala.classes

class Browser(val version: Double, val kind: String, val platform: Seq[String])

object Browser{

  def apply(version: Double, kind: String, platform: Seq[String]): Browser = new Browser(version, kind, platform)
}
