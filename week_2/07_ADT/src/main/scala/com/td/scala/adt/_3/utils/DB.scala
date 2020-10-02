package com.td.scala.adt._3.utils

import com.td.scala.adt._3.Browser
import com.td.scala.adt._3.adt.types.kind._
import com.td.scala.adt._3.adt.types.platform._

object DB {

  val browsers = Seq(
    Browser(1.0, Firefox, Seq(Windows, Linux)),
    Browser(3.0, Firefox, Seq(Windows, Linux, MacOs)),
    Browser(10.0, Opera, Seq(Windows, Linux, MacOs)),
    Browser(9.0, Opera, Seq(Windows, MacOs)),
    Browser(15.0, IE, Seq(Windows)),
    Browser(2.1, Safari, Seq(MacOs)),
    Browser(2.6, Safari, Seq(MacOs)),
    Browser(0.1, Chrome, Seq(Windows)),
    Browser(8.3, Firefox, Seq(Windows, MacOs)),
    Browser(3.4, Chrome, Seq(Linux))
  )

  def getBrowser(predicat: Browser => Boolean): Seq[Browser] = browsers.filter(predicat)

}
