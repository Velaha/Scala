scalaVersion in ThisBuild := "2.12.12"

name := "TD Scala"
organization := "com.td.scala"

lazy val scalatest = "org.scalatest" %% "scalatest" % "3.2.0" % Test

// root
lazy val root = (project in file("."))
  .aggregate(
    week1_classes,
    week1_functionalType,
    week1_functions,
    week1_recursion,
    week1_5_either,
    week2_classes,
    week2_case_classes,
    week2_ADT,
    week3_implicits,
    week3_TypeClass,
    week5_app,
    week4_recursion,
    week4_bikers,
    week4_mylist
  )
  .settings(libraryDependencies += scalatest)

// week 1
lazy val week1_intro          = (project in file("week_1/00_intro")).settings(libraryDependencies += scalatest)
lazy val week1_classes        = (project in file("week_1/01_Classes")).settings(libraryDependencies += scalatest)
lazy val week1_functionalType = (project in file("week_1/02_Functional_Type")).settings(libraryDependencies += scalatest)
lazy val week1_functions      = (project in file("week_1/03_Functions")).settings(libraryDependencies += scalatest)
lazy val week1_recursion      = (project in file("week_1/04_Recursion")).settings(libraryDependencies += scalatest)
lazy val week1_5_either       = (project in file("week_1/05_either")).settings(libraryDependencies += scalatest)


// week 2
lazy val week2_classes      = (project in file("week_2/05_Classes")).settings(libraryDependencies += scalatest)
lazy val week2_case_classes = (project in file("week_2/06_Case_Classes")).settings(libraryDependencies += scalatest)
lazy val week2_ADT          = (project in file("week_2/07_ADT")).settings(libraryDependencies += scalatest)

// week 3
lazy val week3_implicits = (project in file("week_3/08_Implicits")).settings(libraryDependencies += scalatest)
lazy val week3_TypeClass = (project in file("week_3/09_TypeClass")).settings(libraryDependencies += scalatest)

// week 4
lazy val week5_app = (project in file("week_5/contactsApp")).settings(
  libraryDependencies ++= Seq(
    "com.typesafe.akka" %% "akka-http"       % "10.1.11",
    "com.typesafe.akka" %% "akka-stream"     % "2.5.26",
    "de.heikoseeberger" %% "akka-http-circe" % "1.31.0",
    "io.circe"          %% "circe-core"      % "0.12.3",
    "io.circe"          %% "circe-generic"   % "0.12.3",
    "io.circe"          %% "circe-parser"    % "0.12.3",
    "de.heikoseeberger" %% "akka-http-circe" % "1.31.0",
    scalatest
  )
)

lazy val week4_recursion = (project in file("week_4/recursion")).settings(libraryDependencies += scalatest)
lazy val week4_mylist = (project in file("week_4/mylist")).settings(libraryDependencies += scalatest)
lazy val week4_bikers = (project in file("week_4/fold")).settings(libraryDependencies += scalatest)



mappings in (Compile, packageDoc) := Seq()
