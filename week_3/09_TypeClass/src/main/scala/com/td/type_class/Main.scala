package com.td.type_class

import com.td.type_class.converter.Currency.{JPN, PND, USD}

object Main extends App{


  //Do some conversions ...
    val myBank = LaNef()

    println("From JPN to EUR :" + myBank.exchange(JPN(18000))(converter.converters.FromYenToEuro).display)

    println("From USD to EUR :" + myBank.exchange(USD(18000))(converter.converters.FromDollarToEuro).display)

    println("From PND to EUR :" + myBank.exchange(PND(18000))(converter.converters.FromPoundToEuro).display)
}
