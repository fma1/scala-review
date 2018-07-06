package chapter7

import scala.collection.immutable.Map

import scala.util.{ Try, Success, Failure }

object QuestionFour {
  def productTwoNumbers(num1Str: String, num2Str: String): Option[Int] = {
    Try(num1Str.toInt) match {
      case Success(num1) =>
        Try(num2Str.toInt) match {
          case Success(num2) => Some(num1 * num2)
          case Failure(_) => None
        }
      case Failure(_) => None
    }
  }
}
