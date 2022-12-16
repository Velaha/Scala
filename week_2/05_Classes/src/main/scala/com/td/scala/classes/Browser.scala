package com.td.scala.classes

// create a class Browser

class Browser (val version : Double, val kind : String, val platform: Seq[String]) {
    override def equals(obj: Any): Boolean = {
        obj match {
            case obj: Browser =>
                obj.isInstanceOf[Browser] &&
                    this.version == obj.version &&
                    this.kind == obj.kind &&
                    this.platform == obj.platform
            case _ => false
        }
    }

    override def hashCode(): Int = {
        val state = Seq(version, kind, platform)
        state.map(_.hashCode()).foldLeft(0)((a, b) => 31 * a + b)
    }
}

object Browser {
    def apply(version : Double, kind : String, platform: Seq[String]) : Browser = new Browser(version, kind, platform)
}