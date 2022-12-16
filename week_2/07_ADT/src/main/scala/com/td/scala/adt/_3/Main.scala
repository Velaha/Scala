package com.td.scala.adt._3

import com.td.scala.adt._3.adt.types.platform.{Linux, Windows}
import com.td.scala.adt._3.adt.types.kind.{Chrome, Firefox, IE, Opera}
import com.td.scala.adt._3.utils.DB

object Main extends App {

  // implement predicated here

  // select all Firefox browsers
    println("All Firefox browsers :")
    //DB.getBrowser(browser => browser.kind.equals(Firefox)).foreach(println)
    DB.getBrowser({
        case Browser(_, Firefox, _) => true
        case _ => false
    }).foreach(println)

  // select all Chrome browsers compliant with Windows platform
    println("\nAll Chrome browsers compliant with Windows platform :")
    //DB.getBrowser(browser => browser.kind.equals(Chrome) && browser.platform.contains(Windows)).foreach(println)
    DB.getBrowser({
        case Browser(_, Chrome, platform) if platform.contains(Windows) => true
        case _ => false
    }).foreach(println)

  // select all browser with version equals to 1.0
    println("\nAll browser with version equals to 1.0 :")
    DB.getBrowser({
        case Browser(1.0, _, _) => true
        case _ => false
    }).foreach(println)

  // select all Opera and IE browsers
    println("\nAll Opera and IE browsers :")
    DB.getBrowser({
        case Browser(_, Opera, _) | Browser(_, IE, _) => true
        case _ => false
    }).foreach(println)

  // select Chrome browser with version 3.4 and compliant with Linux Platform
    println("\nChrome browser with version 3.4 and compliant with Linux Platform :")
    DB.getBrowser({
        case Browser(3.4, Chrome, platform) if platform.contains(Linux) => true
        case _ => false
    }).foreach(println)
}
