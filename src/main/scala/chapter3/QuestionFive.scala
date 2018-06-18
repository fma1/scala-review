package chapter3

import scala.math._

object QuestionFive {
  def print1to100multiples3and5(): Unit = {
    for (i <- 1 to 100) {
      print(s"$i, ")
      if (i % 3 == 0) print("type")
      if (i % 5 == 0) println("safe")
    }
  }
}
