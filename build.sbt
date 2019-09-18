scalaVersion in ThisBuild := "2.12.10"

name:="TD Scala"
organization := "com.td.scala"



lazy val intro = (project in file("00_intro")).dependsOn(classes, functionalType,functions)
lazy val classes = (project in file("01_Classes"))
lazy val functionalType = (project in file("02_Functional_Type"))
lazy val functions = (project in file("03_Functions"))

mappings in (Compile, packageDoc) := Seq()
