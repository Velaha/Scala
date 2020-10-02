scalaVersion in ThisBuild := "2.12.12"

name := "TD Scala"
organization := "com.td.scala"

lazy val commonLibraries = Seq(
  libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.0" % "test"
)

// week 1
lazy val week1_intro = (project in file("week_1/00_intro"))
  .dependsOn(
    week1_classes,
    week1_functionalType,
    week1_functions,
    week1_recursion,
    week2_classes,
    week2_case_classes,
    week2_ADT,
    week3_implicits,
    week3_TypeClass,
    week4_app
  )
  .settings(libraryDependencies ++= Dependencies.scalatest)
lazy val week1_classes        = (project in file("week_1/01_Classes"))
lazy val week1_functionalType = (project in file("week_1/02_Functional_Type"))
lazy val week1_functions      = (project in file("week_1/03_Functions"))
lazy val week1_recursion      = (project in file("week_1/04_Recursion"))

// week 2
lazy val week2_classes      = (project in file("week_2/05_Classes"))
lazy val week2_case_classes = (project in file("week_2/06_Case_Classes"))
lazy val week2_ADT          = (project in file("week_2/07_ADT"))

// week 3
lazy val week3_implicits = (project in file("week_3/08_Implicits"))
lazy val week3_TypeClass = (project in file("week_3/09_TypeClass"))

// week 4
lazy val week4_app = (project in file("week_4/contactsApp")).settings(
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http"   % "10.1.11",
    "com.typesafe.akka" %% "akka-stream" % "2.5.26",
    "de.heikoseeberger" %% "akka-http-circe" % "1.31.0",
    "io.circe" %% "circe-core" % "0.12.3",
    "io.circe" %% "circe-generic" % "0.12.3",
    "io.circe" %% "circe-parser" %"0.12.3",
    "de.heikoseeberger" %% "akka-http-circe" % "1.31.0"
  )
)

mappings in (Compile, packageDoc) := Seq()
