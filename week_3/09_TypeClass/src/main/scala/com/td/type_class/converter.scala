package com.td.type_class

object converter {

  sealed trait Currency {
    val amount: Double
    val symbol: String
    def display: String =
      s"Montant $amount $symbol"
  }

  object Currency {

    case class EUR(amount: Double) extends Currency {
      override val symbol: String = "€"
    }

    case class USD(amount: Double) extends Currency {
      override val symbol: String = "$"
    }

    case class JPN(amount: Double) extends Currency {
      override val symbol: String = "¥"
    }

    case class PND(amount: Double) extends Currency {
      override val symbol: String = "P"
    }

  }

  trait Converter[A, B] {
    def change(amount: A): B
  }

  object converters {

    import Currency._

    implicit object FromEuro2Dollar extends Converter[USD, EUR] {
      override def change(amount: USD): EUR = EUR(amount.amount * 1.5)
    }
    implicit object FromEuro2Yen extends Converter[JPN, EUR] {
      override def change(amount: JPN): EUR = EUR(amount.amount * 0.5)
    }
    implicit object FromEuro2Pound extends Converter[PND, EUR] {
      override def change(amount: PND): EUR = EUR(amount.amount * 10.5)
    }

  }

}
