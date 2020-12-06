package formater

object jsonFormater {

  type Json = String

  trait JsonFormat[A] {
    def format(a: A): Json
  }

}
