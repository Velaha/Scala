package com.td.scala.adt._3

import com.td.scala.adt._2.adt.types.kind.Kind
import com.td.scala.adt._2.adt.types.platform.Platform

case class Browser(version: Double, kind: Kind, platform: Seq[Platform])
