package com.td.scala.type_class.banque

object converter {

  sealed trait Currency {
    val amount: Double
    val symbol: String
    def display: String =
      s"montant ${amount} $symbol"
  }

  case class EUR(amount: Double) extends Currency {
    override val symbol: String = "EURO"
  }
  case class DOL(amount: Double) extends Currency {
    override val symbol: String = "$"
  }
  case class YEN(amount: Double) extends Currency {
    override val symbol: String = "Y"
  }

  trait Converter[A, B] {

    def change(amount: B): A

  }

  object converters {

    implicit object FromEuro2Dollar extends Converter[EUR, DOL] {
      override def change(amount: DOL): EUR = EUR(amount.amount * 1.4)
    }

    implicit object FromEuro2Yen extends Converter[EUR, YEN] {
      override def change(amount: YEN): EUR = EUR(amount.amount * 0.5)
    }

  }

}
