package chapter1

import scala.math._

object QuestionTwo {
  def cToF(x: Int): Int = {
    floor((x.toDouble * 9F/5F) + 32).toInt
  }
}
