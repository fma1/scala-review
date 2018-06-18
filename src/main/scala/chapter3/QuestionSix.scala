package chapter3

import scala.math._

object QuestionSix {
  def print1to100multiples3and5OneLine(): Unit = {
    for (i <- 1 to 100) { print(s"$i, "); if (i % 3 == 0) print("type") else if (i % 5 == 0) println("safe") }
  }
}
