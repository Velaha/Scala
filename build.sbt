scalaVersion in ThisBuild := "2.12.10"

name := "TD Scala"
organization := "com.td.scala"

// week 1
lazy val week1_intro = (project in file("week_1/00_intro")).dependsOn(
  week1_classes,
  week1_functionalType,
  week1_functions,
  week1_recursion
)
lazy val week1_classes        = (project in file("week_1/01_Classes"))
lazy val week1_functionalType = (project in file("week_1/02_Functional_Type"))
lazy val week1_functions      = (project in file("week_1/03_Functions"))
lazy val week1_recursion      = (project in file("week_1/04_Recursion"))

// week 2

lazy val week2_classes = (project in file("week_2/05_Classes"))
lazy val week2_case_classes = (project in file("week_2/06_Case_Classes"))

mappings in (Compile, packageDoc) := Seq()
