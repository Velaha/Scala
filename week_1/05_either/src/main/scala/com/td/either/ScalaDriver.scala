package com.td.either

import scala.util.{ Failure, Success, Try }

/** Typesafe wrapper for Scala of Java's JavaDriver library
  */
class ScalaDriver() {
  // Provide .asScala on java List
  import collection.JavaConverters._

  private val library = new JavaDriver();

  def find(key: String): Option[String] = Option(library.findOne(key))

  def find(keys: String*): List[Option[String]] =
    Try(library.findMany(keys.asJava)) match {
      case Failure(_) => List.empty
      case Success(value) => value.asScala.toList.map(Option.apply)
    }

  def find(max: Int): Either[String, List[String]] =
    Try(library.findAll(max)) match {
      case Failure(exception) => Left(exception.getMessage)
      case Success(value) => Right(value.asScala.toList.map(Option.apply).flatten)
    }
}
