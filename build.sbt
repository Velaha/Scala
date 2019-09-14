scalaVersion in ThisBuild := "2.12.9"

name:="TD Scala"
organization := "com.td.scala"


lazy val intro = (project in file("00_intro"))
lazy val functions = (project in file("01_functions"))

mappings in (Compile, packageDoc) := Seq()