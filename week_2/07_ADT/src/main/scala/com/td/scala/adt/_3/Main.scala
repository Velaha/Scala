package com.td.scala.adt._3

import com.td.scala.adt._2.adt.types.kind.Chrome
import com.td.scala.adt._2.adt.types.platform._
import com.td.scala.adt._2.utils.ReleaseManager

object Main extends App {

  val chrome1_2 = Browser(1.2, Chrome, Seq(Windows, Linux, MacOs))

  val chrome1_3 = ReleaseManager.releaseVersion(chrome1_2, 1.3)

  if (chrome1_3.version == 1.3) { println("great") } else { "oups!!" }

}
