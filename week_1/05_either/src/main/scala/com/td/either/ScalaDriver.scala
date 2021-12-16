package com.td.either

import scala.util.{ Failure, Success, Try }

/** Typesafe wrapper for Scala of Java's JavaDriver library
  */
class ScalaDriver() {
  // Provide .asScala on java List
  import collection.JavaConverters._

  private val library = new JavaDriver();

  def find(key: String): Option[String] = ???

  def find(keys: String*): List[Option[String]] = ???


  def find(max: Int): Either[String, List[String]] = ???
}
