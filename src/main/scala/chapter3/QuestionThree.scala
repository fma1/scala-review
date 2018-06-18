package chapter3

import scala.math._

object QuestionThree {
  def colorMatch(color: String): String = {
    color match {
      case "cyan" => "00FFFF"
      case "magenta" => "FF00FF"
      case "yellow" => "FFFF00"
      case _ => "000000"
    }
  }
}
