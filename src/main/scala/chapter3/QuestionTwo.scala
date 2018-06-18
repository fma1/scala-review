package chapter3

import scala.math._

object QuestionTwo {
  def testDoubleIf(number: Double): String = {
    if (number > 0) "greater"
    else if (number == 0) "same"
    else "less"
  }

  def testDoubleMatch(number: Double): String = {
    number match {
      case n if number > 0 => "greater"
      case n if number == 0 => "same"
      case n if number < 0 => "less"
    }
  }
}
