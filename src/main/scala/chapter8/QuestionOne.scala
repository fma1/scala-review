package chapter8

import java.util.Date

object QuestionOne {
  object PhysicalMediaFormats extends Enumeration {
    type PhysicalMediaFormats = Value
    val CD, DVD, BLURAY = Value
  }

  case class Console(
    val make: String,
    val model: String,
    val debutDate: Date,
    val wifiType: Option[String] = None,
    val physicalMediaFormats: List[Int],
    val maxVideoRes: (Int, Int)
  )

  case class Game(
    val name: String,
    val maker: String,
    val supportedConsoles: List[Console]
  ) {
    def isSupported(console: Console) = supportedConsoles.contains(console)
  }
}
