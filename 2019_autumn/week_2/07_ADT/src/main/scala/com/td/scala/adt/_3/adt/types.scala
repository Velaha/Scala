package com.td.scala.adt._3.adt

object types {

  object kind {

    sealed trait Kind
    case object Chrome extends Kind
    case object Opera extends Kind
    case object Firefox extends Kind
    case object IE extends Kind
    case object Safari extends Kind

  }

  object platform {

    sealed trait Platform

    case object Windows extends Platform
    case object MacOs extends Platform
    case object Linux extends Platform
  }

}
