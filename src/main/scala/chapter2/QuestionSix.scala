package chapter2

import scala.math._

object QuestionSix {
  def telephoneValue(): Long = {
    val inputStr = "Frank,123 Main,925-555-1943,95122"
    val pattern = "[A-Za-z]+,[0-9]+ [A-Za-z]+,([0-9]+)[-]([0-9]+)[-]([0-9]+),[0-9]+".r

    inputStr match {
      case pattern(num1, num2, num3) => (num1 + num2 + num3).toLong
    }
  }

  def telephoneValue2(): (Int, Int, Int) = {
    val inputStr = "Frank,123 Main,925-555-1943,95122"
    val pattern = "[A-Za-z]+,[0-9]+ [A-Za-z]+,([0-9]+)[-]([0-9]+)[-]([0-9]+),[0-9]+".r

    inputStr match {
      case pattern(num1, num2, num3) => (num1.toInt, num2.toInt, num3.toInt)
    }
  }
}
