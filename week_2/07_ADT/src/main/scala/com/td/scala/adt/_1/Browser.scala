package com.td.scala.adt._1

import com.td.scala.adt._1.adt.types.kind.Kind
import com.td.scala.adt._1.adt.types.platform.Platform


case class Browser(version: Double, kind: Kind, platform: Seq[Platform])
