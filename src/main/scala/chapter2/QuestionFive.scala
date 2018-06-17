package chapter2

import scala.math._

object QuestionFive {
  def convertFour(): Int = {
    try {
      128.toChar.toString.toDouble.toInt
    } catch {
      case e: Exception =>
        println("Exception")
        128
    }
  }
}
