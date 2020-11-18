package com.td.scala.adt._3

import com.td.scala.adt._3.adt.types.platform.Windows
import com.td.scala.adt._3.adt.types.kind.{ Chrome, Firefox, IE, Opera }
import com.td.scala.adt._3.adt.types.platform.Linux

object Main extends App {

  // implement predicated here

  // select all Firefox browsers
  def allFF: Browser => Boolean = {
    case Browser(_, Firefox, _) => true
    case _ => false
  }

  //  select all Chrome browsers compliant with Windows platform
  def allChromeWindows: Browser => Boolean = {
    case Browser(_, Chrome, head :: Windows :: tail) => true
    case _ => false
  }
  // select all browser with version equals to 1.0

  def allBrowser1_0: Browser => Boolean = {
    case Browser(1.0, _, _) => true
    case _ => false
  }
  //select all Opera and IE browsers
  def allOperaAndIE: Browser => Boolean = {
    case Browser(_, Opera, _) | Browser(_, IE, _) => true
    case _ => false
  }
  // select Chrome browser with version 3.4 and compliant with Linux Platform
  def allChromeLinux3_4: Browser => Boolean = {
    case Browser(3.4, Chrome, head :: Linux :: tail) => true
    case _ => false
  }

}
