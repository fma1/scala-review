package chapter4

import scala.math._
import scala.annotation.tailrec

object QuestionFive {
  def raisedToPower(base: Double, exponent: Double): Double = {
    pow(base, exponent)
  }

  def raisedToPower2(base: Double, exponent: Double): Double = {
    @tailrec
    def raisedToPower2Helper(acc: Double, base: Double, exponent: Double): Double = {
      if (exponent == 1) acc
      else raisedToPower2Helper(base * acc, base, exponent - 1)
    }
    raisedToPower2Helper(1, base, exponent)
  }
}
