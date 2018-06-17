package chapter3

import scala.math._

object QuestionOne {
  def stringMatch(str: String): String = {
    str match {
      case "" => "n/a"
      case origStr => origStr
    }
  }
}
