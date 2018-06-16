package chapter2

import scala.math._

object QuestionOne {
  def cToF(x: Int): Int = {
    val step1 = x * 9
    val step2 = step1 / 5
    val step3 = step2 + 32
    step3
  }
}
