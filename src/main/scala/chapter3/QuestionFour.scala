package chapter3

import scala.math._

object QuestionFour {
  def print1to100(): Unit = {
    for (i <- 1 to 100) {
      print(s"$i, ")
      if (i % 5 == 0) println()
    }
  }
}
